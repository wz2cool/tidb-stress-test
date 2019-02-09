package com.github.wz2cool.demo.tidbstresstest.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.wz2cool.demo.tidbstresstest.dao.CommentDao;
import com.github.wz2cool.demo.tidbstresstest.dao.UserDao;
import com.github.wz2cool.demo.tidbstresstest.model.dto.CommentDTO;
import com.github.wz2cool.demo.tidbstresstest.model.dto.UserDTO;
import com.github.wz2cool.demo.tidbstresstest.model.entity.table.Comment;
import com.github.wz2cool.demo.tidbstresstest.model.entity.table.User;
import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.dynamic.FilterOperator;
import com.github.wz2cool.dynamic.SortDirection;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DatabaseService {
    @Resource
    private CommentDao commentDao;
    @Resource
    private UserDao userDao;

    public Long getUserCount() {
        DynamicQuery<User> query = DynamicQuery.createQuery(User.class);
        return userDao.selectCountByDynamicQuery(query);
    }


    public List<CommentDTO> getComments(int pageIndex, int pageSize) {
        DynamicQuery<Comment> query = DynamicQuery.createQuery(Comment.class)
                .selectProperty(Comment::getId)
                .selectProperty(Comment::getScore)
                .selectProperty(Comment::getText)
                .selectProperty(Comment::getCreationDate)
                .addSortDescriptor(Comment::getCreationDate, SortDirection.DESC);
        PageInfo<Comment> commentPageInfo = PageHelper.startPage(pageIndex, pageSize, false)
                .doSelectPageInfo(() -> commentDao.selectByDynamicQuery(query));
        List<Comment> comments = commentPageInfo.getList();
        List<CommentDTO> commentDTOS = comments.stream()
                .map(x -> {
                    CommentDTO dto = new CommentDTO();
                    BeanUtils.copyProperties(x, dto);
                    return dto;
                }).collect(Collectors.toList());
        return commentDTOS;
    }

    public List<UserDTO> getUsers(int pageIndex, int pageSize) {
        DynamicQuery<User> query = DynamicQuery.createQuery(User.class)
                .selectProperty(User::getId)
                .selectProperty(User::getDisplayName)
                .selectProperty(User::getAboutMe)
                .selectProperty(User::getWebsiteUrl)
                .selectProperty(User::getProfileImageUrl)
                .addFilterDescriptor(User::getDisplayName, FilterOperator.NOT_EQUAL, null)
                .addSortDescriptor(User::getCreationDate, SortDirection.DESC);
        query.setMapUnderscoreToCamelCase(false);
        PageInfo<User> userPageInfo = PageHelper.startPage(pageIndex, pageSize, false)
                .doSelectPageInfo(() -> userDao.selectByDynamicQuery(query));

        List<User> users = userPageInfo.getList();
        List<UserDTO> userDTOS = users.stream()
                .map(x -> {
                    UserDTO dto = new UserDTO();
                    BeanUtils.copyProperties(x, dto);
                    return dto;
                }).collect(Collectors.toList());
        return userDTOS;
    }
}
