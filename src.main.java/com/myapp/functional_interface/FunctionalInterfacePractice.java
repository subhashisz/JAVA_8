package com.myapp.functional_interface;

@FunctionalInterface
interface MyInterface {
	public void show();

}

public class FunctionalInterfacePractice {
	public static void main(String[] args) {
		MyInterface i = () -> System.out.println("hello");
		i.show();
		Runnable r = () -> System.out.println("Running");
		Thread t1 = new Thread(r);
		t1.start();

	}
}
