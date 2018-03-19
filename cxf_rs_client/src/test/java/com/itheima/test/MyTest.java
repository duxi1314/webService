package com.itheima.test;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import com.itheima.ws.domain.User;

/**
 * ClassName:MyTest <br/>
 * Function: <br/>
 * Date: 2018年3月18日 下午11:31:58 <br/>
 */
public class MyTest {

	@Test
	public void test01() {
		WebClient
				.create("http://localhost:8080/cxf_rs_server/webservice/userService/user")
				.post(new User(1, "张三", "666"));

	}
}
