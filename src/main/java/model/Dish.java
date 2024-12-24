package model;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f

public class Dish {
    private String name;
    private String description;
<<<<<<< HEAD
=======
=======
public class Dish {
    private String name;        // 料理名
    private String description; // 料理の説明
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f

    // コンストラクタ
    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

<<<<<<< HEAD
    // セッター（必要ないかも）
=======
<<<<<<< HEAD
    // セッター（必要ないかも）
=======
    // セッター
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
