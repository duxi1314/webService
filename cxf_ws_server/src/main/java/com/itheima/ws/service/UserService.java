package com.itheima.ws.service;

import javax.jws.WebService;

import com.itheima.ws.domain.User;

/**
 * ClassName:UserService <br/>
 * Function: <br/>
 * Date: 2018年3月18日 下午5:51:16 <br/>
 */

@WebService//webservice服务,提供给外界使用
public interface UserService {

	public void save(User user);
}
