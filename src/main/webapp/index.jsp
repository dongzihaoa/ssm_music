<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- 新 Bootstrap4 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>

    <!-- bootstrap.bundle.min.js 用于弹窗、提示、下拉菜单，包含了 popper.min.js -->
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>

    <!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title></title>

</head>
<body>
<div  class="container">
    <h2>网易云 Music Test</h2>
    <form action="music/findByMusicName" method="post" id="login" >
        <label>
            <input type="text" name="musicName">
        </label>
        <button  class="btn btn-outline-success"  id="a" >查询&nbsp;<span id="span"></span></button>

    </form>

    <a href="${pageContext.request.contextPath}/music/findAll" class="btn btn-outline-primary" role="button">findById01</a>


</div>

</body>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

<script type="text/javascript">

    $('#num').click(function () {
        Math.ceil(Math.random() * 700 + 100);
    })
</script>

<script type="text/javascript">

    $('#num').mousedown(function () {
        let number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
    })

    let elementById = document.getElementById('a');
    $("#a").mouseup(function () {
        let number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
        let id = $("#a");
        id.attr("disabled","true");
        $("#b").attr("disabled","true");
        $("#span").addClass("spinner-border spinner-grow-sm");

        function yes() {
            $("#login").submit();
            // window.location.href='http://localhost:8080/spring/user/login'
            document.getElementById('a').click();
        }
        setTimeout(yes,number01);
        setTimeout(yes,100);
    });

    $("#b").mouseup(function () {
        let number01 =Math.ceil(Math.random()*700+100);
        console.log(number01);
        let id = $("#b");
        id.attr("disabled","true");

        $("#a").attr("disabled","true");

        $("#span01").addClass("spinner-border spinner-grow-sm");
        function yes() {
            window.location.href='http://localhost:8080/spring/register.jsp'
        }
        setTimeout(yes,number01);
        setTimeout(yes,100);

    });
</script>

<script type="text/javascript">
    let isPageHide = false;
    window.addEventListener('pageshow', function () {
        if (isPageHide) {
            window.location.reload();
        }
    });
    window.addEventListener('pagehide', function () {
        isPageHide = true;
    });

</script>

<script type="text/javascript">
    $(".btn").mouseup(function () {
        $(".btn").attr("disabled","true");
    });

</script>

</html>
