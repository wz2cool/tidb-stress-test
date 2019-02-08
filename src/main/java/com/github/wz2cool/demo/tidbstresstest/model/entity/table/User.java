package com.github.wz2cool.demo.tidbstresstest.model.entity.table;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "users")
public class User {

    @Column(name = "Id")
    private Long id;
    @Column(name = "Reputation")
    private Integer reputation;
    @Column(name = "CreationDate")
    private Date creationDate;
    @Column(name = "DisplayName")
    private String displayName;
    @Column(name = "LastAccessDate")
    private Date lastAccessDate;
    @Column(name = "WebsiteUrl")
    private String websiteUrl;
    @Column(name = "Location")
    private String location;
    @Column(name = "AboutMe")
    private String aboutMe;
    @Column(name = "Views")
    private Integer views;
    @Column(name = "UpVotes")
    private Integer upVotes;
    @Column(name = "DownVotes")
    private Integer downVotes;
    @Column(name = "AccountId")
    private Long accountId;
    @Column(name = "ProfileImageUrl")
    private String profileImageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getLastAccessDate() {
        return lastAccessDate;
    }

    public void setLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(Integer upVotes) {
        this.upVotes = upVotes;
    }

    public Integer getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(Integer downVotes) {
        this.downVotes = downVotes;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
