package com.HAH.scope.model;

import java.io.Serializable;

public class Counter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int count;
	
	public int CountUp() {
		return ++ count;
	}

}
