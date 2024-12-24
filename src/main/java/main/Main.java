package main;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



<<<<<<< HEAD
//ルートパス「/」にアクセスがあった場合は、Mainサーブレットが呼ばれる
=======
<<<<<<< HEAD
//ルートパス「/」にアクセスがあった場合は、Mainサーブレットが呼ばれるるるるｒ
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
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
	    LocalTime now = LocalTime.now(); // 現在のローカルタイム
	    
	    //朝用 4:00~10:00
	    if (now.isAfter(LocalTime.of(4, 0)) && now.isBefore(LocalTime.of(10, 0))) {
	        result[0] = "おはようございます！元気が出る朝の副菜を提案します。";
	        result[1] = "朝"; 
	    //昼用 10:00~16:00
	    } else if (now.isAfter(LocalTime.of(10, 0)) && now.isBefore(LocalTime.of(16, 0))) {
	        result[0] = "こんにちは～。お昼ごはんの副菜を提案します。";
	        result[1] = "昼"; 
	    //夜,深夜用 16:00~4:00
	    } else {
	        result[0] = "お疲れ様です。一日の疲れを癒す副菜を提案しますね。";
	        result[1] = "夜"; 
	    }
	    return result;
	}
	
	
<<<<<<< HEAD
=======
=======
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
 
 
 
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
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



