package com.cnpc.ceshi;

public class Test {
	 private Test a;
	 
	 public void say(Test obj){
		 a=obj;
		 System.out.println(a);
	 }
	 public static void main(String[] args){
		 Test test=new Test();
		 test.say(test);
		 System.out.println(test);
	  
	 }

}
