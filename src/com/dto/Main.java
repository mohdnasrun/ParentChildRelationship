package com.dto;

import com.dto.impl.ChildA;
import com.dto.impl.ChildB;

public class Main
{
	public static void main(String[] args) {
	    Main m = new Main();
	    m.testChild(new ChildA());
		
		
	}
	
	public void testChild(ParentInt t){
	    System.out.println(t instanceof ChildB);
	    System.out.println(t instanceof ChildA);
	    //System.out.println("Hello World "+t.getChildAName());
	    
	}
}
