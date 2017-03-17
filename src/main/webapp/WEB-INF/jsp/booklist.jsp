<jsp:include page="include.jsp"></jsp:include>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${books}" var="book">
    <h3><c:out value="${book.bookName}"></c:out></h3>
    <h4><c:out value="${book.bookNum}"></c:out> </h4>
</c:forEach>

</body>
</html>
