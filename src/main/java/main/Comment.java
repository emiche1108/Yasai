package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//野菜→コメント
@WebServlet("/showComment")
public class Comment extends HttpServlet {

    // 野菜に関連するコメントを保持するMap
    private static final Map<String, String> vegetableComments = new HashMap<>();
    
    // 初期化
    static {
        initializeComments();
    }


	public Comment(String commentText, String vegetable) {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	// 野菜ごとのコメント
	private static void initializeComments() {
	    vegetableComments.put("にんじん", "にんじんはビタミンAが豊富で目に良いです！ビタミンCも含まれており、肌を健康に保ち、コラーゲンの生成をサポートします。");
	    vegetableComments.put("かぼちゃ", "かぼちゃは食物繊維が豊富で、腸内環境を整える効果があります。");
	    
	    vegetableComments.put("トマト", "トマトに含まれるリコピンは抗酸化作用があり、体内の有害な物質を減らす助けをします。");
	    vegetableComments.put("赤パプリカ", "カリウムが含まれており、血圧を安定させる作用があります。");
	    vegetableComments.put("梅干し", "梅干しに含まれるクエン酸は、体内のエネルギーを作り出す働きがあるため、疲れを取るのに役立ちます。");
	    
	    vegetableComments.put("とうもろこし", "エネルギーを代謝するために重要なビタミンB群が含まれてます。疲労回復を助けます");
	    vegetableComments.put("さつまいも", "さつまいもは血糖値の急激な上昇を抑えるため、糖尿病予防や管理にも有益です。");
	    vegetableComments.put("じゃがいも", "じゃがいもはカリウムが豊富で、血圧を安定させます！");
	    
	    vegetableComments.put("ほうれん草", "ほうれん草は鉄分が豊富で、貧血予防になります！");
	    vegetableComments.put("ブロッコリー", "ブロッコリーはビタミンCが豊富で免疫力を高めます！");
	    vegetableComments.put("きゅうり", "きゅうりは水分が多く、体をクールダウンさせます！");
	    
	    vegetableComments.put("ブルーベリー", "ブルーベリーは抗酸化作用が強く、健康に良い！");
	    vegetableComments.put("ナス", "ナスの皮にはナスニンという抗酸化物質が含まれており、血管の健康にも貢献するとされています。");
	    
	    vegetableComments.put("大根", "大根は消化を助け、胃腸に優しいです！");
	    vegetableComments.put("白ネギ", "白ネギは血行を促進し、体を温めます！");
	}
    
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		//文字化けを防ぐ
	    response.setContentType("text/html; charset=UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    
	    
	    // 色からランダムに選ばれた野菜を取得
        String vegetable = request.getParameter("vegetable");
        
        // 野菜名が指定されていない場合や空の場合のデフォルト処理
        if (vegetable == null || vegetable.isEmpty()) {
            vegetable = "デフォルトの野菜"; 
        }
        
        
        // コメントを取得
        String commentText = vegetableComments.getOrDefault(vegetable, "コメントはありません。");
        
        // コメントをリクエストに設定
        request.setAttribute("commentText", commentText);

        // 結果ページへ転送
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
    }
}





