<jsp:include page="WEB-INF/jsp/include.jsp"></jsp:include>
<body>
<h2>H123123</h2>

<form action="/book/search" method="post">
    <input type="text" name="id"/>
    <input  type="text" name="bookName"/>
    <button type="submit" value="提交" ></button>
</form>
<br/>

<h1><button value="提交" id="doAjax">提交</button></h1>

<script type="text/javascript">

    $(this).ready(function () {
        alert("哈哈哈哈");
    });

</script>
</body>
</html>
