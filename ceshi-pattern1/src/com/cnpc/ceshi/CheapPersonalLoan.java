package com.cnpc.ceshi;

public class CheapPersonalLoan extends PersonalLoan {
	
	@Override
	public final String getAge(){
	   return "cheap personal loan"; //compilation error: overridden method is final
	}

}
