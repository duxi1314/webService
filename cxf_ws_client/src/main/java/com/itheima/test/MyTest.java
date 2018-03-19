package com.itheima.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.ws.service.User;
import com.itheima.ws.service.impl.UserService;

/**  
 * ClassName:MyTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月18日 下午9:21:39 <br/>       
 */
public class MyTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService service = (UserService) context.getBean("client");
		
		User user = new User();
		user.setId(1);
		user.setUsername("后羿");
		user.setPassword("666");
		service.save(user);
	}
}
  
