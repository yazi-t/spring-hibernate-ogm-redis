<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 4/19/17
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ tag description="Wrapper tag" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ attribute name="page_heading" fragment="true" required="true" description="heading and page bar expected here" %>
<%@ attribute name="page_body" fragment="true" required="true" description="main content of the page" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Vehicle Info</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />">
    <link rel="stylesheet" href="<c:url value="/css/custom-basic.css"/>">
</head>
<body>

<nav class="navbar" style="background: rgb(219, 219, 219)">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/" />">
                <jsp:invoke fragment="page_heading"/>
            </a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="<c:url value="/" />">Summary</a></li>
            <li><a href="<c:url value="/add" />">Create New</a></li>
        </ul>

        <div class="col-sm-5 col-md-5">
            <form class="navbar-form" action="<c:url value="/search" />"  role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" name="key" id="srch-term" style="border: none;">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit" style=" border: none;">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
        <p style="color: rgb(170, 170, 170);padding-top: 15px;">
            &nbsp;&nbsp;&nbsp;&nbsp;Created by Yasitha Thilakaratne for demonstration purpose.</p>
    </div>
</nav>

<div class="container">
    <jsp:invoke fragment="page_body"/>
</div>

<footer>
    <div class="container-fluid">

    </div>
</footer>

<script src="<c:url value="/css/jquery.min.js" />"></script>
<script src="<c:url value="/css/bootstrap.min.js" />"></script>
</body>
</html>
