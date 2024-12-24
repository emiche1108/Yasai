package model;


public class Dish {
    private String name;
    private String description;

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

    // セッター（必要ないかも）
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
