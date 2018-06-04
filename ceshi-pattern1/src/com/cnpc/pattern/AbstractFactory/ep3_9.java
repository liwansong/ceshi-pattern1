package com.cnpc.pattern.AbstractFactory;

public class ep3_9 {

	public static void main(String[] args) {
        TiXing one=new TiXing(1,2,3);
        System.out.println("one's down is:"+one.down);
        TiXing two=new TiXing(4,5,6);
        System.out.println("one's down is:"+one.down);
        System.out.println("two's down is:"+two.down);
    
        System.out.println("TiXing's down is:"+TiXing.down);

	}

}
