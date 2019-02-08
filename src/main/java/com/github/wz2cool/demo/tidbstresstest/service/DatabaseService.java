package com.github.wz2cool.demo.tidbstresstest.service;

import com.github.wz2cool.demo.tidbstresstest.dao.CommentDao;
import com.github.wz2cool.demo.tidbstresstest.dao.UserDao;
import com.github.wz2cool.demo.tidbstresstest.model.entity.table.User;
import com.github.wz2cool.dynamic.DynamicQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

}
