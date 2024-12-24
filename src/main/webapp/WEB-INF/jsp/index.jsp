<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ColorDish（カラーディッシュ）</title>
    
    
    <style>
    /* ページ全体の基本スタイル */
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            text-align: center;
            padding: 50px;
        }

        /* 見出しのスタイル */
        h1 { color: #555; }
        h2 { color: #; }

        /* 段落スタイル */
        p {
            font-size: 18px;
            color: #555;
        }

        /* 各セクションのスタイル */
        section {
            margin-bottom: 20px;
        }
        
        
        
        
    /* 手作りボタンのスタイル */
        button {
            padding: 12px 24px;
            font-size: 16px;
            cursor: pointer;
            border: 3px solid #8B0000;
            background-color: #8B4513;
            color: white;
            font-weight: bold;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
            transition: background-color 0.3s, transform 0.2s;
        }

        button:hover {
            background-color: #A0522D;
            transform: scale(1.1);
        }

        button:focus {
            outline: none;
        }
        
         /* 色選択ボタンのスタイル */
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
        .white {
            background-color: white;
            color: black;
            border: 1px solid black;
        }

        .button-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 10px;
            max-width: 350px;
            margin: 0 auto;
        }







        /* フッター */
        .footer {
            background-color: #f1f1f1;
            text-align: center;
            padding: 20px 0;
            font-size: 14px;
            color: #333;
            border-top: none;
        }

        .footer p {
            margin: 0;
        }
        
        /* フッター内画像のスタイル */
        .footer img {
        	width: 50px;         /* 画像の幅 */
        	height: auto;        /* 画像の高さを自動調整 */
        	margin-bottom: 10px; /* 画像の下に余白 */
}
    
    
    
    </style>
    
</head>


<body class="${greetingClass}">
	<p>副菜提案アプリ「ColorDish」へようこそ。<br></p>
    <h1>${greeting}</h1>
    
    <!-- 始めるボタン -->
    <form action="colorSelect" method="get">
    	<button type="submit">始める</button>
    </form>
    
    
    <!--フッターのリンク -->
    <jsp:include page="/WEB-INF/jsp/footer.jsp" />

</body>


</html>
