var app = (function(){
    let init = function(){
       login_form();


    }
    let login_form = function(){
        var wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML =
        '<form action="/action_page.php">'
        +'  First name:<br>'
        +'  <input type="text" name="firstname" value="Mickey">'
        +'  <br>'
        +'  Last name:<br>'
        +'  <input type="text" name="lastname" value="Mouse">'
        +'  <br><br>'
        // +'  <input id="login" type="submit" value="로그인">'
        // +'  <input id="signin" type="submit" value="회원가입">'
        +'</form> '
        +'<button id="login">로그인</button>'
        +'<button id="sign">회원가입</button>'

         var sign = document.querySelector('#sign');
         var login = document.querySelector('#login');
         sign.addEventListener('click',function(){
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
            var okay = document.querySelector('#okay');
            okay.addEventListener('click',function(){
                wrapper.innerHTML =
                '<form action="/action_page.php">'
                +'  First name:<br>'
                +'  <input type="text" name="firstname" value="Mickey">'
                +'  <br>'
                +'  Last name:<br>'
                +'  <input type="text" name="lastname" value="Mouse">'
                +'  <br><br>'
                +'</form> '
                +'<button id="login">로그인</button>'
                +'<button id="sign">회원가입</button>'
                 });
    
         });
         
        //  var btn2 = document.querySelector('#btn2');
        //  btn2.addEventListener('click',function(){
        //  var temp = document.createTextNode('새로 추가됨');
        //  target.appendChild(temp);
        //  })
    }





    return {init : init} ; 
})()