package com.coderscampus.arraylist;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> customStringList = new CustomArrayList<>();
		
		customStringList.add("a");
		customStringList.add("b");
		customStringList.add("c");
		customStringList.add("d");
		customStringList.add("e");
		customStringList.add("f");
		customStringList.add("g");
		customStringList.add("h");
		customStringList.add("i");
		customStringList.add("j");
		customStringList.add("j");
		customStringList.add("a");
		customStringList.add("b");
		customStringList.add("c");
		customStringList.add("d");
		customStringList.add("e");
		customStringList.add("f");
		customStringList.add("g");
		customStringList.add("h");
		customStringList.add("i");
		customStringList.add("j");
		customStringList.add("k");
		
		
		
		for (int i = 0; i < customStringList.getSize(); i++) {
			System.out.println(customStringList.get(i));
			//System.out.println(customStringList.getSize());
		}
		
		System.out.println(customStringList.get(0));
		
		
		

	}

}
