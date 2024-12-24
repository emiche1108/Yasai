<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>色選択ページ</title>
    
    <!-- CSSのリンク -->
    <style>
    
    
    
    
    </style>
</head>


<body bgcolor="#f00">
    <h1>${greeting}</h1>
    <p>提案してほしい副菜の色を選んでね</p>
    
    <!-- 色選択ボタン -->
    <!-- colorSelect.jspに飛ぶ指示  -->
    <form action="ColorSelect" method="post"> 
        <div class="button-container">
            <button type="submit" name="color" value="赤色" class="color-button red">赤色</button>
            <button type="submit" name="color" value="オレンジ色" class="color-button orange">オレンジ色</button>
            <button type="submit" name="color" value="黄色" class="color-button yellow">黄色</button>
            <button type="submit" name="color" value="緑色" class="color-button green">緑色</button>
            <button type="submit" name="color" value="紫色" class="color-button blue">紫色</button>
            <button type="submit" name="color" value="白色" class="color-button white">白色</button>
        </div>
    </form>
    
    <!-- フッターのリンク -->
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
</body>

</html>
