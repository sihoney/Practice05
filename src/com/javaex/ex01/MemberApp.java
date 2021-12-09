package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member("jws", "정우성", 5000);
		Member m2 = new Member("yjs", "유재석", 3000);
		Member m3 = new Member("lhr", "이효리", 4000);
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
	}

}
