<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 6/9/17
  Time: 5:18 PM
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
    All Vehicles
  </jsp:attribute>

  <jsp:attribute name="page_body">

    <c:choose>
      <c:when test="${vehicle == null}">
        <div class="alert alert-danger">
          Vehicle not found
        </div>
      </c:when>
      <c:otherwise>
        <div class="row detail">
          <div class="col-md-5">Reg No</div><div class="col-md-5">${vehicle.reNo}</div>
        </div>

        <div class="row detail">
          <div class="col-md-5">Type</div><div class="col-md-5">${vehicle.type}</div>
        </div>

        <div class="row detail">
          <div class="col-md-5">Model</div><div class="col-md-5">${vehicle.model}</div>
        </div>

        <div class="row detail">
          <div class="col-md-5">Manufacturing Year</div><div class="col-md-5">${vehicle.manufacturingYear}</div>
        </div>

        <div class="row detail">
          <div class="col-md-5">Chassis No</div><div class="col-md-5">${vehicle.chassisNo}</div>
        </div>

        <div class="row detail">
          <div class="col-md-5">Record Date</div><div class="col-md-5">${vehicle.recordDate}</div>
        </div>
      </c:otherwise>
    </c:choose>

  </jsp:attribute>
</t:twrapper>
