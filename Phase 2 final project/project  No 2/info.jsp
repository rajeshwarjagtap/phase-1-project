<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Travel information </h1>
<form action="searchinfo" method ="get">
Enter source <input type="text"name="source"><br><br>
Enter Distination <input type="text"name="disti"><br>
<h5>eg mumbai,pune,bengaluru,chennai..</h5>

Enter the travel date <input type="date"name="source"><br>

To check your flight <input type="submit" value ="save">
<h3>click here to book ticket</h3>
<a href="searchinfo1"> To Book click here </a>
</form>
</body>
</html>