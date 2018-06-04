package com.cnpc.ceshi;

public class luxi extends pepo {

	@Override
	void print() {
		System.out.println("print方法执行");

	}

	@Override
	void show() {
		System.out.println("show方法执行");

	}

	public static void main(String[] args) {
		luxi xx=new luxi();
		xx.print();
		xx.show();
		xx.get();
	}

}
