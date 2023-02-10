package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private int articlefield;
    private String comment;
    private LocalDateTime timeCreated = LocalDateTime.now();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticlefield() {
        return articlefield;
    }

    public void setArticlefield(int articlefield) {
        this.articlefield = articlefield;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private int user_id;
}
