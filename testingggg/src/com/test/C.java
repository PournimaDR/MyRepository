package com.test;

public class C implements A,B{

	public static void main(String[] args) {
		A a=new C();
		a.add();
		B b=new C();
		b.add();
	}
	public  void add()
	{
		System.out.println("hiiiiii");
	}

	

}


