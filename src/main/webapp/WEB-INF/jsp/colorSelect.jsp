<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>色選択ページ</title>
<<<<<<< HEAD
    
    <!-- CSSのリンク -->
    <style>
    
    
    
    
=======
    <style>
        /* ボタンのスタイル */
        .color-button {
            margin: 10px;
            padding: 15px;
            width: 100px;
            height: 50px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            color: white;
            cursor: pointer;
        }
        
        .red { background-color: red; }
        .orange { background-color: orange; color: black; }
        .yellow { background-color: yellow; color: black; }
        .green { background-color: green; }
        .blue { background-color: blue; }
        .white { background-color: white; color: black; border: 1px solid black; }

        /* フォーム内のボタン配置を制御 */
        .button-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 10px;
            max-width: 350px; /* 3列分の幅を設定 */
            margin: 0 auto;   /* 中央揃え */
        }
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    </style>
</head>


<<<<<<< HEAD
<body bgcolor="#f00">
=======
<body>
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    <h1>${greeting}</h1>
    <p>提案してほしい副菜の色を選んでね</p>
    
    <!-- 色選択ボタン -->
<<<<<<< HEAD
    <!-- colorSelect.jspに飛ぶ指示  -->
=======
    <!-- colorSelect.jspに飛ぶ設定  -->
<<<<<<< HEAD
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
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
    
<<<<<<< HEAD
    <!-- フッターのリンク -->
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
</body>

=======
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />
=======
    <form action="colorSelect" method="post"> 
        <div class="button-container">
            <button type="submit" name="color" value="赤" class="color-button red">赤色</button>
            <button type="submit" name="color" value="オレンジ" class="color-button orange">オレンジ色</button>
            <button type="submit" name="color" value="黄" class="color-button yellow">黄色</button>
            <button type="submit" name="color" value="緑" class="color-button green">緑色</button>
            <button type="submit" name="color" value="紫" class="color-button blue">紫色</button>
            <button type="submit" name="color" value="白" class="color-button white">白色</button>
        </div>
    </form>
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
</body>


>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
</html>
