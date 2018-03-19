package com.itheima.ws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.itheima.ws.domain.User;

/**
 * ClassName:UserService <br/>
 * Function: <br/>
 * Date: 2018年3月18日 下午5:51:16 <br/>
 */

public interface UserService {

	@POST
	@Path("/user") // 指定请求路径
	@Consumes(MediaType.APPLICATION_XML) // 指定参数的传输格式
	public void save(User user);
}
