<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration</title>
    </head>
<body>
<h1 align="center">Пройдите мини-регистрацию для того, чтобы пройти опрос!</h1> <br>
<form action="questions">
    <p> <label for="name">Введите ваше имя:</label>
    <input id="name" type="text" placeholder="Ваше имя"> </p>
    <p> <label for="surname">Введите вашу фамилию:</label>
    <input id="surname" type="text" placeholder="Ваша фамилия"> </p>
    <p> <label for="age" >Выбирите ваш возраст:</label>
    <select id="age">
        <option value="age1">14-18</option>
        <option value="age2">18-22</option>
        <option value="age3">22-26</option>
        <option value="age4">26-30</option>
    </select> </p>
    <p> <input type="submit" value="Выбрать"> </p>
</form>
</body>
</html>
