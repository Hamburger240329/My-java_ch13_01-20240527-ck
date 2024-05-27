package com.ham1142.exer01;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		

	List<Member> memberList = new ArrayList<Member>();
	
	Member member1 = new Member();
	member1.setId("tiger");
	member1.setPw("12345");
	member1.setAge(25);
	member1.setName("홍길동");
	member1.setPhone("010-1234-8888");
	
	Member member2 = new Member();
	member2.setId("lion");
	member2.setPw("33333");
	member2.setAge(32);
	member2.setName("이순식");
	member2.setPhone("010-7777-5555");
	
	Member member3 = new Member("blackcat", "66666", "김유신", 41, "010-4321-5871");
	
	memberList.add(member1);
	memberList.add(member2);
	memberList.add(member3);
	
	
	if (memberList.isEmpty()) {
		System.out.println("비어있음");
	}else{
		System.out.println("비어있지 않음");
	}
	
	}
}
