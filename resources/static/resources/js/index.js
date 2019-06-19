// use
var app =  {
   $wrapper : $wrapper = document.querySelector('#wrapper'),
   init : init
   
   
};
var customer = {
    login_form : login_form,
    join_form : join_form,
    join : join,
    count : count,
    login : login,
    mypage : mypage,
    remove : remove,
    update : update,
    update_form : update_form
}

   function init(){
       $wrapper.innerHTML = customer.login_form();
       document.querySelector('#join-btn')
               .addEventListener('click',()=>{
                    $wrapper.innerHTML = customer.join_form();
                    document.getElementById('confirm-btn')
                            .addEventListener('click', e=>{
                                e.preventDefault();
                                alert('조인버튼 클릭');
                                customer.join();
           });
       });
       document.querySelector('#login-btn')
                .addEventListener('click',e=>{
                e.preventDefault();
                customer.login();
                });
       

   }
   function login(){
        id = document.getElementById('customerId').value;
        pass = document.getElementById('password').value;
        let xhr = new XMLHttpRequest();
        xhr.open('GET', 'customers/'+id+'/'+pass, true);
        xhr.onload=()=>{ 
           if(xhr.readyState=== 4 && xhr.status === 200){
               let d = JSON.parse(xhr.responseText);
               alert('로그인 성공 후 이름' +d.customerName)
               if(d){
                   $wrapper.innerHTML = customer.mypage(d);
                   document.querySelector('#update-btn')
                           .addEventListener('click',e=>{
                            $wrapper.innerHTML = customer.update_form(d);
                            e.preventDefault();
                      
                            document.querySelector('#complete-btn')
                                    .addEventListener('click',e=>{
                                     var update_data ={
                                                        customerId : d.customerId,
                                                        customerName : document.getElementById("customerName").value,
                                                        password : document.getElementById("password").value,
                                                        ssn : d.ssn,
                                                        phone : document.getElementById("phone").value,
                                                        city : document.getElementById("city").value,
                                                        address : document.getElementById("address").value,
                                                        postalcode : document.getElementById("postalcode").value
                                                        }
                                    update(update_data);
                                     e.preventDefault();
                                    })
                            document.querySelector('#cancel-btn')
                                    .addEventListener('click',e=>{
                                       customer.mypage(d);
                                        e.preventDefault();
                                    })
                                
                            
    })
               }else{
                   $wrapper.innerHTML = customer.login_form();
               }
           }
        };
           xhr.send();
    }
   function login_form(){
    return '<form action="/action_page.php">'
    +'  ID:<br>'
    +'  <input type="text" id="customerId" name="customerId">'
    +'  <br>'
    +'  Password:<br>'
    +'  <input type="text" id="password" name="password">'
    +'  <br><br>'
    +'  <input id="login-btn" type="button" value="LOGIN">'
    +'  <input id="join-btn" type="button" value="JOIN">'
    +'</form> ';
 };
 
 function join(){
    let xhr = new XMLHttpRequest()
    let data = {
     customerId : document.getElementById("customerId").value,
     customerName : document.getElementById("customerName").value,
     password : document.getElementById("password").value,
     ssn : document.getElementById("ssn").value,
     phone : document.getElementById("phone").value,
     city : document.getElementById("city").value,
     address : document.getElementById("address").value,
     postalcode : document.getElementById("postalcode").value
    };
    xhr.open('POST','customers',true);
    xhr.setRequestHeader('Content-type','application/json;charset=UTF-8');
    xhr.onload=()=>{
         if(xhr.readyState === 4 && xhr.status === 200){
             let d = JSON.parse(xhr.responseText);
             if(d.result === 'SUCCESS'){
                 alert('회원가입 성공' + d.result);
                 $wrapper.innerHTML = customer.login_form();
             }else{
                 alert('회원가입 실패');
             }
             
         }
         else{
             alert('ajax 실패');
         }
    }
 //    
    xhr.send(JSON.stringify(data));
}
    
 function join_form(){
    return '<form>'
    +'I D<br>'
    +'    <input type="text" id="customerId" name="customerId"><br>'
    +'P W<br>'
    +'    <input type="password" id="password" name="password"><br>'
    +'Name<br>'
    +'    <input type="text"  id="customerName" name="customerName"><br>'
    +'ssn<br>'
    +'    <input type="text"  id="ssn" name="ssn"><br>'
    +'phone<br>'
    +'    <input type="text"  id="phone" name="phone"><br>'
    +'city<br>'
    +'    <input type="text"  id="city" name="city"><br>'
    +'address<br>'
    +'    <input type="text"  id="address" name="address"><br>'
    +'postalcode<br>'
    +'    <input type="text"  id="postalcode" name="postalcode"><br>'
    +'    <input id="confirm-btn" type="submit" value="확인">'
    +'    <input id="cancel-btn" type="reset" value="취소">'
    +'</form>';
 };


   function count(){
       var xhr = new XMLHttpRequest();
       
       xhr.open('GET', 'customers/count', true);
       xhr.onload=()=>{
           if(xhr.readyState===4 && xhr.status === 200){
               alert('성공');
               let wrapper = document.querySelector('#wrapper');
               wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>'
           }
       }
       xhr.send();
   }

function mypage (x){
    let custom = x;
    
    alert('마이페이지로 넘어온 객체명 :' + custom.customerName)

    return '<form>'
    +'<spen>' + custom.customerName + '마이페이지' + '<br />'
    +'<spen> ID : ' + custom.customerId + '</spen><br/>'
    +'<spen> PW : ' + custom.password + '</spen><br/>'
    +'<spen> Name : ' + custom.customerName + '</spen><br/>'
    +'<spen> ssn : ' + custom.ssn +'</spen><br/>'
    +'<spen> phone : ' + custom.phone + '</spen><br/>'
    +'<spen> city : ' + custom.city + '</spen><br/>'
    +'<spen> address : ' + custom.address + '</spen><br/>'
    +'<spen> postalcode : ' + custom.postalcode + '</spen><br/>'
    +'<input id="update-btn" type="button" value="수  정">'
    +'<input id="remove-btn" type="button" value="탈  퇴">'
    
};

function update_form(x){
    let update = x;
    let template = '<form>'
    +'<spen> ID : ' + update.customerId + '</spen><br/>'
    +'P W<br>'
    +'    <input type="password" id="password" name="password" value="'+update.password+'"><br>'
    +'Name<br>'
    +'    <input type="text"  id="customerName" name="customerName" value="'+update.customerName+'"><br>'
    +'<spen> ssn : ' + update.ssn +'</spen><br/>'
    +'phone<br>'
    +'    <input type="text"  id="phone" name="phone" value="'+update.phone+'"><br>'
    +'city<br>'
    +'    <input type="text"  id="city" name="city" value="'+update.city+'"><br>'
    +'address<br>'
    +'    <input type="text"  id="address" name="address" value="'+update.address+'"><br>'
    +'postalcode<br>'
    +'    <input type="text"  id="postalcode" name="postalcode" value="'+update.postalcode+'"><br>'
    +'    <input id="complete-btn" type="button" value="완료" >'
    +'    <input id="cancel-btn" type="reset" value="취소">'
    +'</form>'
    return template;
 };
function update(x){
    let wrapper = document.querySelector('#wrapper');
    wrapper.innerHTML = customer.update_form(x);
    
    alert(x.customerId);
    
    var xhr = new XMLHttpRequest();

        xhr.open('PUT', 'customers/'+x.customerId, true);
        xhr.setRequestHeader('Content-type','application/json;charset=UTF-8');
        xhr.onload=()=>{ 
            if(xhr.readyState=== 4 && xhr.status === 200){
                let d = JSON.parse(xhr.responseText);
                alert('수정완료' +x.customerName)
                alert(d);
                if(d){
                    alert('수정완료' + d.result);
                    $wrapper.innerHTML = customer.mypage(x);
                }else{
                    alert("수정실패")
                    $wrapper.innerHTML = customer.login_form();
                }
            }else{
                alert("수정실패2")

            }
         };
     xhr.send(JSON.stringify(x));
    }
    
function remove(){
    let customerId = document.getElementById(customerId);
    let xhr = new XMLHttpRequest();
    xhr.open('delete','customers/' + customerId,true);
    xhr.onload=()=>{ 
        if(xhr.readyState=== 4 && xhr.status === 200){
            let d = JSON.parse(xhr.responseText);
            alert('로그인 성공 후 이름' +d.customerName)
            if(d){
                $wrapper.innerHTML = customer.mypage(d);
            }else{
                $wrapper.innerHTML = customer.login_form();
            }
        }
     };
        xhr.send();
}


  
