<%--
  Created by IntelliJ IDEA.
  User: HaiNguyen
  Date: 10/18/2018
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    body {
        margin: 0;
        align-content: center;
    }

    .login {
        height: 350px;
        width: 500px;
        margin: 0;
        padding: 10px 10px 10px 30px;
        border: 10px #CCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px
    }
</style>
<body>
<form method="post" action="calculator">
    <div class="login">
        <h1>Simple Calculator</h1>
        <input type="number" name="firstNumber" size="30" placeholder="First Number"/>
        <br>
        <select name="operator" id="">
            <option value="+">Addition</option>
            <option value="-">Minus</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
        </select>
        <br>
        <input type="number" name="secondNumber" size="30" placeholder="Second Number"/>
        <br>
        <input type="submit" value="Calculator"/>
    </div>
</form>
</body>
</html>