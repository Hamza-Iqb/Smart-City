<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<c:url value="/css/signup.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<meta charset="ISO-8859-1">
<title>Login to S-C</title>
</head>
<body>


	  <form action="/home" style="border:1px solid #ccc">
       <div class="container">
         <h1>Sign Up</h1>
         <p>Please fill in this form to create an account.</p>
         <hr>

         <label for="firstName"><b>First Name</b></label>
         <input type="text" placeholder="Enter First Name" name="firstName" required>

         <label for="lastName"><b>Last Name</b></label>
         <input type="text" placeholder="Enter Last Name" name="lastName" required>

         <label for="email"><b>Email</b></label>
         <input type="text" placeholder="Enter Email" name="email" required>

         <br>
         <select name = "userType">
                   <option value="">Select the type of account you would like to register for</option>
                   <option value="BUSINESSMAN">Businessman</option>
                   <option value="STUDENT">Student</option>
                   <option value="TOURIST">Tourist</option>
         </select>
         <br><br>
         <label for="username"><b>Username</b></label>
         <input type="text" placeholder="Enter Username" name="username" required>

         <label for="password"><b>Password</b></label>
         <input type="password" placeholder="Enter Password" name="password" required>

         <label for="pswRepeat"><b>Repeat Password</b></label>
         <input type="password" placeholder="Repeat Password" name="pswRepeat" required>


         <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

         <div class="clearfix">
           <button type="submit" href="${pageContext.request.contextPath}/" class="cancelbtn">Cancel</button>
           <button type="submit" class="signupbtn">Sign Up</button>
         </div>
       </div>
     </form>


</body>
</html>