package com.cnpc.project.A;

public class MainClass {
	/**
	* java多线程同步锁的使用
	* 示例：三个售票窗口同时出售10张票
	* */
	public static void main(String[] args) {
		//实例化站台对象，并为每一个站台取名字
		Station station1=new Station("窗口1");
		
		Thread th1 = new Thread(station1, "窗口1");//每个线程等其他线程释放该锁后，才能执行
		Thread th2 = new Thread(station1, "窗口2");
		Thread th3 = new Thread(station1, "窗口3");
		Thread th4 = new Thread(station1, "窗口4");
		th1.start();
		 th2.start();
		th3.start();
		th4.start();
		  
	  
	}
  
}