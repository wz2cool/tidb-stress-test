package com.github.wz2cool.demo.tidbstresstest.model.entity.table;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "comments")
public class Comment {

    @Column(name = "Id")
    private Long id;
    @Column(name = "PostId")
    private Long postId;
    @Column(name = "Score")
    private Long score;
    @Column(name = "Text")
    private String text;
    @Column(name = "CreationDate")
    private Date creationDate;
    @Column(name = "UserId")
    private Long userId;
    @Column(name = "UserDisplayName")
    private String userDisplayName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }
}
