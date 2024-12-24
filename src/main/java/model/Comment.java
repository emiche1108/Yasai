package model;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
public class Comment {
    private String commentText;
    private String vegetable;
    private String content; 
<<<<<<< HEAD

=======
   
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    // コンストラクタ
    public Comment(String commentText, String vegetable, String content) {
        this.commentText = commentText;
        this.vegetable = vegetable;
        this.content = content;
<<<<<<< HEAD
    }
    
    
    // getterまとめ
    public String getCommentText() {
        return commentText;
    }

    public String getVegetable() {
        return vegetable;
    }
    
    public String getContent() {
        return content;
    }
    
    
    // setterまとめ
=======
        }
    
    
    public String getCommentText() {
        return commentText;
        }

    public String getVegetable() {
        return vegetable;
        }
    
    public String getContent() {
        return content;
        }
    
    
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
    
    public void setContent(String content) {
        this.content = content;
<<<<<<< HEAD
    }
    
    
    // 詳細コメントを返すメソッド
    public String getDetailedComment() {
        return content;  // content を返す
    }
    

    // commentText と vegetable を使ったコンストラクタ
=======
        }
    
    
    
    public Comment() {
    	}
    
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
    public Comment(String commentText, String vegetable) {
        this.commentText = commentText;
        this.vegetable = vegetable;
    }
    
}

<<<<<<< HEAD
=======





=======

public class Comment {
        private String commentText;
        private String vegetable;

        public Comment(String commentText, String vegetable) {
            this.commentText = commentText;
            this.vegetable = vegetable;
        }

        public String getCommentText() {
            return commentText;
        }

        public String getVegetable() {
            return vegetable;
        }
    }
>>>>>>> 4b8df0a50088db22eeda3ab243d12a5b37dfe2d3
>>>>>>> 4976e6a0c7407dff8b999dad23553ccb31385f8f
