package com.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
private	String name;

public ThreadPool(String name) {
	this.name= name;
}

	@Override
	public void run() {
		System.out.println("thread start"+name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("thread end"+name);
		
	}
public static void main(String[] args) {
	 
ExecutorService e=	Executors.newFixedThreadPool(5);

for(int i =1; i<=10;i++) {
	ThreadPool thread = new ThreadPool("My name is... "+i);
	e.execute(thread);
	
}
}
}
