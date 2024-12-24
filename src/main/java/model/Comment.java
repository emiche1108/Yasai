package model;

<<<<<<< HEAD
public class Comment {
    private String commentText;
    private String vegetable;
    private String content; 
   
    // コンストラクタ
    public Comment(String commentText, String vegetable, String content) {
        this.commentText = commentText;
        this.vegetable = vegetable;
        this.content = content;
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
    
    
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
    
    public void setContent(String content) {
        this.content = content;
        }
    
    
    
    public Comment() {
    	}
    
    public Comment(String commentText, String vegetable) {
        this.commentText = commentText;
        this.vegetable = vegetable;
    }
    
}






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
