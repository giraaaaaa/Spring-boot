var app = (function(){
    let init = function(){ //맨 처음 보여줄 화면
       login_form();


    }
    let login_form = function(){
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
        // +'<button id="login">로그인</button>'
        // +'<button id="sign">회원가입</button>'
        let signin_btn = document.querySelector('#signin_btn')
        signin_btn.addEventListener('click', function(){
                join_form();
            })
    }
    let join_form = function(){
        let wrapper = document.querySelector('#wrapper');
          wrapper.innerHTML =
           +'<form action="/action_page.php">'
           +'ID:<br>'
           +'<input type="text" name="firstname" value="Mickey">'
           +'<br>'
           +'IW:<br>'
           +'<input type="text" name="lastname" value="Mouse">'
           +'<br>'
           +'email:<br>'
           +'<input type="text" name="lastname" value="Mouse">'
           +'<br><br>'
           +'</form> '
           +'<button id="okay">확인</button>'
        let okay = document.querySelector('#okay');
        okay.addEventListener('click',function(){
            login_form();
        })
        
    }




    return {init : init} ; 
})()