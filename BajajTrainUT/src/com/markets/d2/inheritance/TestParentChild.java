package com.markets.d2.inheritance;

public class TestParentChild {
	public static void main(String args[]) {
		// FOR CHILD PARENT
		Child child = new Child(200);
		child.display();
		child.show();
		child.addition();
		
		System.out.println("\n\nUsing References");
		Parent ref;
		ref= new Parent();
		//ref.show(); It will show error;
		ref.display();
		ref= new Child();
		ref.display();//Child version
		
		
		System.out.println("\n\nUsing The DEMO\n");
		TestParentChild.demo(new Parent());
		TestParentChild.demo(new Child());
		
		
	}
	public static void demo(Parent obj) {
		obj.display();
	}

}
