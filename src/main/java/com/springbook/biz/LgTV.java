package com.springbook.biz;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV--- 전원 켬");
	}
	public void powerOff() {
		System.out.println("LgTV--- 전원 끔");
	}
	public void volumeUp() {
		System.out.println("LgTV--- 소리 키움");
	}
	public void volumeDown() {
		System.out.println("LgTV--- 소리 줄임");
	}
}
