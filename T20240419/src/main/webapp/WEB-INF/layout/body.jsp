<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h3 id="msg"></h3>

<form name="loginForm" action="main.do">
</form>

<script>
  (function () {
    let name = prompt('enter your name!!');

    if (!name) {
      // document.querySelector('form[name="loginForm"]').submit();
      document.createElement('form').setAttribute('action', 'main.do').submit();
      return;
    }

    fetch('checkName.do?name=' + name)
      .then(resolve => resolve.json())
      .then(userValidation)
      .catch(errorCall);
  })();


  function userValidation(result) {
    if (result.retCode == 'Success') {
      fetch('cheering.do')
        .then(resolve => resolve.json())
        .then(result => {
          document.querySelector('#msg').innerHTML = result.msg;
        })
        .catch(console.error);

    } else {
      document.querySelector('form[name="loginForm"]').submit();

    }
  }

  function errorCall(err) {
	  console.error(err);
  }
</script>