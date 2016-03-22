package com.cn.contiy.module.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.contiy.module.biz.UseBiz;
import com.cn.contiy.module.dao.UserDao;
import com.cn.contiy.module.entity.User;

@Service("userBiz")
public class UserBizImpl implements UseBiz {
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
