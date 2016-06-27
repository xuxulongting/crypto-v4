package com.mldn.demo;

class Person{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class RefDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per[] = new Person[3];
		for(int i=0;i<per.length;i++)
		{
			System.out.println(per[i]+" ");
		}
		
		per[0]=new Person("aa",10);
		per[1]=new Person("bb",20);
		per[2]=new Person("cc",3);
		
		for(int i=0;i<per.length;i++)
		{
			System.out.println(per[i]+" ");
		}
		
		
	}

}
