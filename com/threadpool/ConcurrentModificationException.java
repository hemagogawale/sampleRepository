package com.threadpool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException extends Thread {
	
	static List list = new ArrayList();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	     list.add("E");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		ConcurrentModificationException t = new ConcurrentModificationException();
		t.start();
			
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(3000);
		}

		
		
	}

}
