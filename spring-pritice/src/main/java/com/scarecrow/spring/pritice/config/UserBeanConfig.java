package com.scarecrow.spring.pritice.config;

import com.scarecrow.spring.pritice.xml.lifecycle.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfig {

	@Bean
	public UserBean userBean() {
		UserBean userBean = new UserBean();
		userBean.setUsername("java config");
		userBean.setPwd("java config");
		userBean.setTel("java config");
		return userBean;
	}
}
