<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 5/9/17
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:twrapper>

  <jsp:attribute name="page_heading">
    Start Page
  </jsp:attribute>

  <jsp:attribute name="page_body">

    <form action="<c:url value="/search" />">
        <div style="margin: 19px 0px 100px;">
            <h2>Enter Reg No</h2>
            <input type="text" class="form-control text-large" name="key">
        </div>
    </form>
  </jsp:attribute>
</t:twrapper>
