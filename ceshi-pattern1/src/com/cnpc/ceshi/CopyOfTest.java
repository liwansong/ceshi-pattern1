package com.cnpc.ceshi;

public class CopyOfTest {
	 private CopyOfTest a;
	 
	 public void say(CopyOfTest obj){
		 a=obj;
		 System.out.println(a);
		 System.out.println("主干修改内容");
	 }
	 public static void main(String[] args){
		 CopyOfTest test=new CopyOfTest();
		 test.say(test);
		 System.out.println(test);
	  
	 }

}
