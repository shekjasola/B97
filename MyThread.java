package com.thread2;

public class MyThread implements Runnable {

	public void run() {

		for (int x = 0; x <= 4; x++) {

			System.out.println("Run By " + Thread.currentThread().getName() + " " + x);
			try {
				Thread.sleep(1 * 60 * 100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.setName("A");
		t2.setName("B");

		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main Thread");
	}

}
