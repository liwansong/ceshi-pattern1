package com.cnpc.ceshi;

public class CopyOfTest {
	 private CopyOfTest a;
	 
	 public void say(CopyOfTest obj){
		 a=obj;
		 System.out.println(a);
	 }
	 public static void main(String[] args){
		 System.out.println("分支内容哦");
		 CopyOfTest test=new CopyOfTest();
		 test.say(test);
		 System.out.println(test);
	  
	 }

}
