package com.itheima.ws.service.impl;

import com.itheima.ws.domain.User;
import com.itheima.ws.service.UserService;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: <br/>
 * Date: 2018年3月18日 下午5:51:50 <br/>
 */
public class UserServiceImpl implements UserService {

	public void save(User user) {
		
		System.out.println("用户已经保存"+user);
	}

}
