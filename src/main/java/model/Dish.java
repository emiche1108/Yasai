package model;

public class Dish {
    private String name;        // 料理名
    private String description; // 料理の説明

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

    // セッター
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
