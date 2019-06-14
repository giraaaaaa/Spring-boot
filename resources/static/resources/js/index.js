var app = (()=>{
    let init = ()=>{ //맨 처음 보여줄 화면
       login_form();


    }
    let login_form = ()=>{ //시작화면
        let wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML =
        '<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        +'  <input id="login_btn" type="button" value="로그인">'
        +'  <input id="signin_btn" type="button" value="회원가입">'
        +'</form> '
        // 회원가입 버튼의 아이디를 만들어준다. id는 필요할때만 만들도록 해야한다.
            let signin_btn = document.querySelector('#signin_btn')
            signin_btn.addEventListener('click', ()=>{
                    join_form();
                })//클릭시 join form으로 이동
       
            let login_btn = document.querySelector('#login_btn');
            login_btn.addEventListener('click', ()=>{
                alert("로그인 버튼 성공");
                count();
            });
    }   
    let count =()=>{
        let xhr = new XMLHttpRequest();
        method = 'GET';
        url='count';
        xhr.open(method, url, true);

        xhr.onreadystatechange=()=>{
            if(xhr.readyState===4 && xhr.status == 200){
                alert("성공");
                let wrapper = document.querySelector('#wrapper')
                wrapper.innerHTML = '<h1 id="count">'+xhr.responseText+'</h1>'   
            }
        }
        xhr.send();
    }
    let join_form = ()=>{
        let wrapper = document.querySelector('#wrapper');
                  wrapper.innerHTML =
           '<form action="/action_page.php">'
           +'  I  D:<br>'
           +'  <input type="text" name="firstname" value="">'
           +'  <br>'
           +'  P  W:<br>'
           +'  <input type="text" name="lastname" value="">'
           +'  <br>'
           +'  email:<br>'
           +'  <input type="text" name="lastname" value="">'
           +'  <br><br>'
           +'  </form> '
           +'  <button id="okay">확인</button>'
        let okay = document.querySelector('#okay');
        okay.addEventListener('click',()=>{
            login_form();
        })//로그인 폼으로 이동
        
    }




    return {init : init} ; 
})()