package com.scarecrow.spring.pritice.xml;

import com.scarecrow.spring.pritice.xml.naming.TestBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author wangbo
 * @since 2023/6/8 10:23
 */
public class TestDefaultListableBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory(null);
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions("xml/naming/TestBean.xml");
		System.out.println(defaultListableBeanFactory.getBean("testBean"));
		System.out.println("---getAliases---");
		for (String testBean : defaultListableBeanFactory.getAliases("testBean3")) {
			System.out.println(testBean);
		}
		System.out.println("---getBeanNamesForType---");
		String[] beanNamesForType = defaultListableBeanFactory.getBeanNamesForType(TestBean.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}

	}
}
