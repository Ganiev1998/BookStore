<html>
<head>
    <%@include file="css.jsp"%>
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/login_admin">
    <div class="mb-3">
        <label for="userName" class="form-label">username: </label>
        <input type="text"  id="userName" name="userName" required>
    </div>
    <div class="mb-3">
        <label for="password" class="form-label">password: </label>
        <input type="text" id="password" name="password" required>
    </div>
    <div class="mb-3">
        <label for="role_id" class="form-label">role_id : </label>
        <input type="number"  id="role_id" required>
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
<%@include file="js.jsp"%>
</body>
</html>