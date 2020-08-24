package com.springbook.biz;

public class TVUser {
	public static void main(String[] args) {
		//SamsungTV tv = new SamsungTV();
		//TV tv = new LgTV();
		//TV tv = new SamsungTV();
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]); //명령행 매개변수 전달
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
