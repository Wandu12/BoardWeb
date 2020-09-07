package com.springbook.biz;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker--- 소리 올림");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker--- 소리 내림");
		
	}

}
