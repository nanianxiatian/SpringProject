package com.sz.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sz.model.User;

public class SpringDemo {

	
	public static void main(String[] args) {
		
		 //从ApplicationContex 应用上下文容器中获取bean和从bean工厂容器中获取bean
		
		//1.从应用上下文容器中获取bean
		//这种方式一开始就会被实例化
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User) applicationContext.getBean("user");
		user.Hello();
		
		//2.从bean工厂容器获取bean
		//这种方式需要的时候才会被实例化
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		User user1 = (User) factory.getBean("user");
		user.Hello();

	}

}
