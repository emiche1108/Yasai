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

<<<<<<< HEAD
import model.Dish;

=======
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3


//色→野菜
@WebServlet("/ColorSelect")
public class ColorSelect extends HttpServlet {

    @Override
<<<<<<< HEAD
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 文字化けを防ぐ（リクエスト側）
        request.setCharacterEncoding("UTF-8");
        
        // 文字化けを防ぐ（レスポンス側）
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        
        // ユーザーが選択した色を取得
        String selectedColor = request.getParameter("color");
        // 色が選ばれていない場合
        if (selectedColor == null || selectedColor.isEmpty()) {
            request.setAttribute("error", "色を選んでください。");
            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
            return;
        }
        
=======
    //JSPでmethod="post"を使用しているので、サーブレット側ではdoPostメソッドを使う
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // ユーザーが選択した色を取得
        String selectedColor = request.getParameter("color");

>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
        // 色に基づく野菜のリストを取得
        List<String> vegetables = getVegetablesByColor(selectedColor);

        // 野菜リストをランダムに選択
        String randomVegetable = getRandomVegetable(vegetables);

<<<<<<< HEAD
        // 選ばれた色と野菜をセット
        request.setAttribute("selectedColor", selectedColor);
        request.setAttribute("randomVegetable", randomVegetable);
        
        // 野菜に基づくレシピ（副菜）を取得
        List<Dish> recipes = VegeAndRecipe.getRecipesForVegetable(randomVegetable);
        
        // レシピリストからランダムに1つ選択
        Dish selectedRecipe = getRandomDish(recipes);
        request.setAttribute("selectedRecipe", selectedRecipe);
        
        // 結果ページに遷移
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
        dispatcher.forward(request, response);  // JSPにリクエストを転送
    }
    
    // ランダムに1つのレシピを選択するメソッド
    private Dish getRandomDish(List<Dish> recipes) {
        if (recipes == null || recipes.isEmpty()) {
            return null;  // レシピがない場合はnullを返す
        }
        int randomIndex = (int) (Math.random() * recipes.size());
        return recipes.get(randomIndex);
    }

    private List<String> getVegetablesByColor(String color) {
        List<String> vegetables = new ArrayList<>();
        switch (color) {
            case "オレンジ色":
                vegetables.add("にんじん");
                vegetables.add("かぼちゃ");
                break;
            case "赤色":
=======
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
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
                vegetables.add("トマト");
                vegetables.add("赤パプリカ");
                vegetables.add("梅干し");
                break;
<<<<<<< HEAD
            case "黄色":
=======

            case "黄":
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
                vegetables.add("とうもろこし");
                vegetables.add("さつまいも");
                vegetables.add("じゃがいも");
                break;
<<<<<<< HEAD
            case "緑色":
=======

            case "緑":
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
                vegetables.add("ほうれん草");
                vegetables.add("ブロッコリー");
                vegetables.add("きゅうり");
                break;
<<<<<<< HEAD
            case "紫色":
                vegetables.add("ブルーベリー");
                vegetables.add("ナス");
                break;
            case "白色":
                vegetables.add("大根");
                vegetables.add("白ネギ");
                break;
=======

            case "紫":
                vegetables.add("ブルーベリー");
                vegetables.add("ナス");
                break;

            case "白":
                vegetables.add("大根");
                vegetables.add("白ネギ");
                break;

>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
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


<<<<<<< HEAD



=======
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
