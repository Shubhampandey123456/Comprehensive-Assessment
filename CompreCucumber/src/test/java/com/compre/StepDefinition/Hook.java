package com.compre.StepDefinition;

import com.compre.ReusableClass.Base;

import io.cucumber.java.BeforeAll;

public class Hook extends Base{
	
	@BeforeAll
	public static void init()
	{
		initializeReport();
	}

}
