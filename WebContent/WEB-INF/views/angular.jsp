<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="resources/angular.js"></script>
<script type="text/javascript" src="resources/angularex.js">"
</script>
<!-- <script type="text/javascript">
var myapp=angular.module('myapp',[]);
myapp.controller('myctrl',function($scope){
	 $scope.mess = "Hello Angular";
});
</script>
 -->
</head>
<body data-ng-app="myapp">
	<div data-ng-controller="myctrl">
		<h1>{{mess}}</h1>
	</div>
	<div data-ng-controller="ajaxctrl">
		<table>
			<tr>
				<th>BookId</th>
				<th>Author</th>
				<th>Book Description</th>
			</tr>
			<tr data-ng-repeat="book in books">
			<td>{{book.bookId}}</td>
			<td>{{book.bookName}}</td>
			<td>{{book.bookDesc}}</td>
			</tr>
		</table>
	</div>
</body>
</html>