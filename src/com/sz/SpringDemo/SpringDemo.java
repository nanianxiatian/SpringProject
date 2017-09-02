package com.sz.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sz.model.User;

public class SpringDemo {

	
	public static void main(String[] args) {
		
		 //��ApplicationContex Ӧ�������������л�ȡbean�ʹ�bean���������л�ȡbean
		
		//1.��Ӧ�������������л�ȡbean
		//���ַ�ʽһ��ʼ�ͻᱻʵ����
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User) applicationContext.getBean("user");
		user.Hello();
		
		//2.��bean����������ȡbean
		//���ַ�ʽ��Ҫ��ʱ��Żᱻʵ����
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		User user1 = (User) factory.getBean("user");
		user.Hello();

	}

}
