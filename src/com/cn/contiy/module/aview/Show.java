package com.cn.contiy.module.aview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cn.contiy.module.biz.UseBiz;

public class Show {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"Web/WEB-INF/config/beans.xml");
		UseBiz useBiz = (UseBiz) context.getBean("userBiz");
		System.out.println(useBiz.getUserList());
	}
}
