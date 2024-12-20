package main;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//ルートパス「/」にアクセスがあった場合は、Mainサーブレットが呼ばれる
@WebServlet("/")
public class Main extends HttpServlet {
 
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     
     // 挨拶メッセージを生成
     String[] greetingData = generateGreetingMessage();
     
     // メッセージをリクエスト属性に設定
     request.setAttribute("greeting", greetingData[0]);  // 挨拶メッセージ
     request.setAttribute("greetingClass", greetingData[1]);  // 背景クラス
     
     // 挨拶ページに遷移
     RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
     dispatcher.forward(request, response);
 }
 
 // 時間帯別詳細設定
 private String[] generateGreetingMessage() {
     String[] result = new String[2];
     LocalTime now = LocalTime.now();
     
     if (now.isBefore(LocalTime.NOON)) {
         result[0] = "おはようございます！元気が出る朝の一品を提案します。";
         result[1] = "morning"; // 朝用のクラス名
         
     } else if (now.isBefore(LocalTime.of(18, 0))) {
         result[0] = "こんにちは～。お昼ごはんの副菜を提案します。";
         result[1] = "afternoon"; // 昼用のクラス名
         
     } else {
         result[0] = "お疲れ様です。今夜の副菜をご提案しましょうか？";
         result[1] = "evening"; // 夜用のクラス名
     }
     
     return result;
 }
 
 
 
    // 色選択ページに遷移
    @WebServlet("/colorSelect")  
    public static class ColorSelectServlet extends HttpServlet {
    	
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        	
            // colorSelect.jspへフォワード
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/colorSelect.jsp");
            dispatcher.forward(request, response);
        }
        
    }
    
}



