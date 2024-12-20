package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//色→野菜
@WebServlet("/ColorSelect")
public class ColorSelect extends HttpServlet {

    @Override
    //JSPでmethod="post"を使用しているので、サーブレット側ではdoPostメソッドを使う
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // ユーザーが選択した色を取得
        String selectedColor = request.getParameter("color");

        // 色に基づく野菜のリストを取得
        List<String> vegetables = getVegetablesByColor(selectedColor);

        // 野菜リストをランダムに選択
        String randomVegetable = getRandomVegetable(vegetables);

        //選ばれた色と野菜をセット
        request.setAttribute("selectedColor", selectedColor); //
        request.setAttribute("randomVegetable", randomVegetable);


        // 結果ページに遷移
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);
        }
    
    
    private List<String> getVegetablesByColor(String color) {
        List<String> vegetables = new ArrayList<>();
        
        switch (color) {
            case "オレンジ":
                vegetables.add("にんじん");
                vegetables.add("かぼちゃ");
                break;

            case "赤":
                vegetables.add("トマト");
                vegetables.add("赤パプリカ");
                vegetables.add("梅干し");
                break;

            case "黄":
                vegetables.add("とうもろこし");
                vegetables.add("さつまいも");
                vegetables.add("じゃがいも");
                break;

            case "緑":
                vegetables.add("ほうれん草");
                vegetables.add("ブロッコリー");
                vegetables.add("きゅうり");
                break;

            case "紫":
                vegetables.add("ブルーベリー");
                vegetables.add("ナス");
                break;

            case "白":
                vegetables.add("大根");
                vegetables.add("白ネギ");
                break;

            default:
                vegetables.add("選ばれた色に関連する情報がありません。");
                break;
        }
        return vegetables;
    }

    private String getRandomVegetable(List<String> vegetables) {
        if (vegetables == null || vegetables.isEmpty()) {
            return "対応する野菜が見つかりません。";
        }
        int randomIndex = (int) (Math.random() * vegetables.size());
        return vegetables.get(randomIndex);
    }
}


