package model;


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
