<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ColorDish（カラーディッシュ）</title>
    
    <!-- CSSのリンク -->
    <link rel="stylesheet" type="text/css" href="/Yasai/css/style.css">
    
    
</head>


<body class="${greetingClass}"
	<p>副菜提案アプリ「ColorDish」へようこそ。<br></p>
    <h1>${greeting}</h1>
    
    <!-- 始めるボタン -->
    <form action="colorSelect" method="get">
    	<button type="submit">始める</button>
    </form>
    
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />

</body>


</html>
