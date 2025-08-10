<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
<h1>User List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Account ID</th>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td><a href="/users/${user.id}">${user.username}</a></td>
            <td>${user.accountId}</td>
        </tr>
    </#list>
</table>
<a href="/users/signup">Sign Up</a>
</body>
</html>
