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
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }

        main {
            margin: 20px;
        }

        section {
            margin-bottom: 20px;
        }

        h1, h2 {
            color: #333;
        }

        .vegetable-list {
            list-style-type: none;
            padding-left: 0;
        }

        .vegetable-list li {
            background-color: #f4f4f4;
            padding: 10px;
            margin-bottom: 5px;
            border-radius: 5px;
        }

        .side-dish {
            background-color: #e0f7fa;
            padding: 10px;
            border-radius: 5px;
        }

        .comment-item {
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 5px;
        }
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
        	<!-- コメントリストから表示 -->
        	<c:forEach var="comment" items="${comments}">
        		<div class="Comment">
        			<p>${comment.commentText}</p>
        		</div>
        	</c:forEach>
        	<c:if test="${empty comments}">
        		<p>コメントはありません。</p>
        	</c:if>
        </section>
        
        
        <!-- 戻るボタン -->
        <form action="ReturnColorSelect" method="get">
            <button type="submit">気に入らない。選びなおす</button>
        </form>
        
        <!--準備中ページへ -->
        <form action="recipezyunnbi.jsp" method="get">
            <button type="submit">気に入った！作り方教えて</button>
        </form>
    </main>
    
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
</body>

</html>
