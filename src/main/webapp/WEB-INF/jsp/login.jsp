<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }

        .container {
            width: 400px;
            margin: auto;
            margin-top: 50px;
            padding: 20px;
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0px 0px 5px #ccc;
        }

        h1 {
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 10px;
        }

        label {
            font-size: 18px;
        }

        input[type="email"],
        input[type="password"] {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0px 0px 3px #ccc;
        }

        button {
            padding: 10px;
            font-size: 18px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            box-shadow: 0px 0px 3px #ccc;
            cursor: pointer;
            transition: all 0.2s;
        }

        button:hover {
            background-color: #0056b3;
            box-shadow: 0px 0px 5px #ccc;
        }

        .error-message {
            color: red;
        }

        .sign-up {
            text-align: center;
            margin-top: 20px;
        }

        .sign-up a {
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="container">
    <c:if test="${not empty errorMsg}">
	     <div class="alert alert-danger" role="alert">${errorMsg}</div>
	</c:if>
        <h1>Sign In</h1>
        <form method="post" action="">
            <label for="Email">Email:</label>
            <input type="email" id="Email" name="Email" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit" name="action" value="signin">Sign In</button>
            <div class="error-message">${errorMessage}</div>
        </form>
        <div class="sign-up">
            Don't have an account? <a href="register">Sign Up</a>
        </div>
    </div>
</body>
</html>
