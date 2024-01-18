<html>
<head>
    <%@include file="css.jsp"%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/login_admin" method="post">
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
        <input type="number" id="role_id" name="role_id" required>
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
<%@include file="js.jsp"%>
</body>
</html>