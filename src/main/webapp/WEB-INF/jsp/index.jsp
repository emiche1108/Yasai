<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ColorDish（カラーディッシュ）</title>
    
    <!-- CSSのリンク -->
<<<<<<< HEAD
    <link rel="stylesheet" type="text/css" href="/Yasai/css/style.css">
    
=======
    <link rel="stylesheet" type="text/css" 
    href="${pageContext.request.contextPath}/css/style.css">
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
    
</head>


<<<<<<< HEAD
<body class="${greetingClass}"
	<p>副菜提案アプリ「ColorDish」へようこそ。<br></p>
    <h1>${greeting}</h1>
=======
<body>
    <h1>${greeting}</h1>
    	<p>簡単副菜提案アプリ「ColorDish（カラーディッシュ）」へようこそ。
    	始めるには以下のボタンを押してください。</p>
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
    
    <!-- 始めるボタン -->
    <form action="colorSelect" method="get">
    	<button type="submit">始める</button>
    </form>
<<<<<<< HEAD
    
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
=======
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3

</body>


</html>
