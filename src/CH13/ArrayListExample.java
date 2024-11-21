package CH13;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java");  //String 객체를 저장
		list.add("JDBC");
		list.add("Servet/J5P");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // 저장된 총 객체 수 얻기
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		Sys
	}

}
