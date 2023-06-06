package com.scarecrow.spring.pritice.config;

import com.scarecrow.spring.pritice.xml.lifecycle.UserBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserBeanConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserBeanConfig.class);
		UserBean userBean = applicationContext.getBean(UserBean.class);
		System.out.println(userBean);
		applicationContext.close();
	}
}
