<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ColorDish（カラーディッシュ）</title>
    
    <!-- CSSのリンク -->
    <link rel="stylesheet" type="text/css" 
    href="${pageContext.request.contextPath}/css/style.css">
    
</head>


<body>
    <h1>${greeting}</h1>
    	<p>簡単副菜提案アプリ「ColorDish（カラーディッシュ）」へようこそ。
    	始めるには以下のボタンを押してください。</p>
    
    <!-- 始めるボタン -->
    <form action="colorSelect" method="get">
    	<button type="submit">始める</button>
    </form>

</body>


</html>
