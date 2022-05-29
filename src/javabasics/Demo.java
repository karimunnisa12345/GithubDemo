package javabasics;

public class Demo {
	int a=10; // variable
	void display() // method
	{
		System.out.print("Hello this is my first java program");	
	}
	public static void main(String args[]){
		Demo obj=new Demo(); // object creation
		System.out.println(obj.a);
		obj.display();
		
	}
	
	
	
}
