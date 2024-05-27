package com.ham1142.exer02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> list = new Vector<Board>();
		
		list.add(new Board("가입인사드려요1", "반갑습니다. 오늘 가입했어요1", "홍길동1"));
		list.add(new Board("가입인사드려요2", "반갑습니다. 오늘 가입했어요2", "홍길동2"));
		list.add(new Board("가입인사드려요3", "반갑습니다. 오늘 가입했어요3", "홍길동3"));
		list.add(new Board("가입인사드려요4", "반갑습니다. 오늘 가입했어요4", "홍길동4"));
		list.add(new Board("가입인사드려요5", "반갑습니다. 오늘 가입했어요5", "홍길동5"));
		
		list.remove(2);
		
		
		
		
		
		
		
	}

}
