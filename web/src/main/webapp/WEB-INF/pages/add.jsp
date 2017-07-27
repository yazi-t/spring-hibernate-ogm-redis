<%--
  Created by IntelliJ IDEA.
  User: yasitha
  Date: 5/9/17
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<t:twrapper>

  <jsp:attribute name="page_heading">
    Add Vehicle
  </jsp:attribute>

  <jsp:attribute name="page_body">
    <div class="row">
        <div class="col-lg-6">
            <form:form class="form-horizontal" action="save" modelAttribute="vehicle"
                       method="POST" name="vehicle" id="vehicle">
                <div class="form-group">
                    <label for="reNo">Registration No:</label>
                    <form:input cssClass="form-control" id="reNo" path="reNo" maxlength="100"
                                required="required"/>
                </div>
                <div class="form-group">
                    <label for="type">Type:</label>
                    <form:select cssClass="form-control" path="type" id="type" items="${types}" required="required"/>
                </div>
                <div class="form-group">
                    <label for="type">Model:</label>
                    <form:select cssClass="form-control" path="model" id="model" items="${models}" required="required"/>
                </div>
                <div class="form-group">
                    <label for="type">Manufacturing Year:</label>
                    <form:select cssClass="form-control" path="manufacturingYear" id="manufacturingYear" required="required">
                        <c:forEach begin="2005" end="2017" varStatus="loop">
                            <form:option value="${loop.index}" label="${loop.index}"/>
                        </c:forEach>
                    </form:select>
                </div>
                <div class="form-group">
                    <label for="reNo">Chassis No:</label>
                    <form:input cssClass="form-control" id="chassisNo" path="chassisNo" maxlength="100"
                                required="required"/>
                </div>
                <div class="form-group">
                    <label for="reNo">Engine Capacity:</label>
                    <form:input cssClass="form-control" id="engineCapacity" path="engineCapacity" maxlength="100"
                                required="required"/>
                </div>
                <button type="submit" class="btn btn-default">Save</button>
            </form:form>
        </div>
    </div>
  </jsp:attribute>
</t:twrapper>
