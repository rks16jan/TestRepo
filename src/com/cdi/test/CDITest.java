package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.BussinesUnit;

public class CDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		BussinesUnit bussinesUnit = factory.getBean("bussinesUnit", BussinesUnit.class);
		System.out.println(bussinesUnit);

	}

}
