<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<c:url value="/css/signin.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<meta charset="ISO-8859-1">
<title>Login to S-C</title>
</head>
<body>


	 <form action="test" method="post">

      <div class="container">
      <h1>Sign In to Smart City</h1>

      <hr>
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="uname" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>

        <button type="submit">Login</button>
      </div>

      <div class="container" style="background-color:#f1f1f1">
        <button formaction="/signup" type="submit" class="createbtn">Create Account</button>
      </div>
    </form>


</body>
</html>