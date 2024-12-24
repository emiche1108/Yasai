<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.List" %>
<%@ page import="model.Dish" %>
<%@ page import="model.Comment" %>

<!DOCTYPE html>
<html lang="ja">


<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>副菜のご提案</title>
    
    
    <!-- CSSのリンク -->
    <style>

/* ロゴのスタイル 
.logo {
    margin-top: 20px;
    max-width: 200px;
}*/


    
    </style>
</head>


<body>
    <main>
        <h1>選ばれた色: ${selectedColor}</h1>
        <h2>選ばれた野菜：${randomVegetable}</h2>

        <!-- 副菜の提案 -->
        <section>
            <h2>～${randomVegetable}を使った副菜の提案～</h2>
            <!-- 副菜（Dish）リストからランダムに1つだけ表示 -->
            <c:if test="${not empty selectedRecipe}">
                <div class="Dish">
                    <p>提案された副菜: ${selectedRecipe.name}</p>
                    <p>副菜の説明: ${selectedRecipe.description}</p>
                </div>
            </c:if>
            <c:if test="${empty selectedRecipe}">
                <p>副菜の提案はありません。</p>
            </c:if>
        </section>
        
        
        <!-- コメントの表示 -->
        <section>
        	<h2>管理栄養士おすすめポイント</h2>
        	<!-- comments が null または空でないかをチェック -->
        	<c:if test="${empty comments}">
        		<p>コメントはありません。</p>
        	</c:if>
        	
        	<!-- コメントがある場合、ループして表示 -->
        	<c:forEach var="comment" items="${comments}">
        	<p class="comment-item">${comment.commentText}</p>
        	</c:forEach>
        
        
        <!-- 戻るボタン -->
        <form action="ReturnColorSelect" method="get">
            <button type="submit">気に入らない。選びなおす</button>
        </form>
        
        <!-- 準備中ページへ -->
        <form action="GoToRecipe" method="get">
            <button type="submit">気に入った！作り方教えて</button>
        </form>
    </main>
    
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
    
</body>

</html>
