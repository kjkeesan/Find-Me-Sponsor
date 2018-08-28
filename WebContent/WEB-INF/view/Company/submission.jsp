<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Bid here
<f:form modelAttribute="bid" action="saveSubBids"  >
	<f:input type="text" path="bidId" value="${id }" readonly="true"/>
	<f:input  type="text" path="bidder" placeholder="Company Name" />
	<f:input type="number" path="bidAmt" placeholder="Bid Amount"/>
	<f:input type="text"  path="bidType" placeholder="Type" />
	<input type="submit" value="submit" />
</f:form>
</body>
</html>