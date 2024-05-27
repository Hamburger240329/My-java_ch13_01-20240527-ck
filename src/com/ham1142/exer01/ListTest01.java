package com.ham1142.exer01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>(); // arraylist 선언
				
				
		// list1 []
		list1.add("홍길동");		// 리시트에 원소(객체) 추가
		list1.add("이순신");
		list1.add("김유신");
			
		int list1Size = list1.size(); //리스트의 크기 -> 원소의 크기

		String memberName = list1.get(1); // 인덱스 1-> 이순신 가져옴
		
//		System.out.println(memberName);
		
		for(int i=0;i<list1.size();i++ ) {
			System.out.println(list1.get(i)); // list[i] X
		}
		list1.remove(1); // 인덱스 1 원소 삭제 -> 이순신 삭제
		list1.remove("이순신"); // 인덱스 1 원소 삭제 -> 이순신 삭제		
		
		System.out.println("-----------------------");
		
		for(int i=0;i<list1.size();i++ ) {
			System.out.println(list1.get(i));
		}	
	}
}

