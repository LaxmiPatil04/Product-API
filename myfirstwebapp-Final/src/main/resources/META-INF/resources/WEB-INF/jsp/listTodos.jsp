<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
		<title>Manage Your Todos</title>		
	</head>
	<body>
		<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
			<a class="navbar-brand m-1" href="https://spring.io/quickstart">springboot</a>
				<div class="collapse navbar-collapse">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
					</ul>
				</div>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
				</ul>	
		</nav>
		<div class="container">
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
		<tr>
			<td>${todo.id}</td>
		<td>${todo.description}</td>
		<td>${todo.targetDate}</td>
		<td>${todo.done}</td>
		<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>   </td>
		<td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>   </td>
		</tr>
		</c:forEach>
						</tbody>
					</table>
				  <a href="add-todo" class="btn btn-success">Add Todo</a>
				</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>	
		<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	</body>
</html>