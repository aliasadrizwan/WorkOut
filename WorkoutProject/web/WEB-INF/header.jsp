<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home | Workout</title>
    <%--Style Sheets--%>
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <%--Java Scripts--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="../js/jquery.validate.min.js"></script>
    <script src="../js/register.js"></script>
    <script src="../js/custom.js"></script>
</head>
<body>
<main>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#about">ABOUT</a></li>
                <li><a href="#contact">CONTACT</a></li>
                <c:choose>
                    <c:when test="${user != null}">
                        <li><a href="#services">WORKOUT</a></li>
                        <li><a href="profile">PROFILE</a></li>
                        <li><a href="settings">SETTING</a></li>
                        <li><a href="logout">LOGOUT</a></li>
                        <li>Welcome <span class="glyphicon glyphicon-user"></span> ${user}</li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="register">REGISTER</a></li>
                        <li><a href="login">LOGIN</a></li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </div>
    </div>
</nav>