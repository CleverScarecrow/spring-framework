package com.scarecrow.spring.pritice.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangbo
 * @since 2022/8/29 20:18
 */
public class BeanLifeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("life/bean_life.xml");
		UserBean userBean = applicationContext.getBean(UserBean.class);
		System.out.println(userBean);
	}
}
