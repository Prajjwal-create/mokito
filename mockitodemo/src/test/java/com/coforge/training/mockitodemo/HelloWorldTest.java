package com.coforge.training.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	
	private IDemo d;
	
	
	@Before
	public void setUp() throws Exception {
		d=mock(IDemo.class);
		when(d.greet()).thenReturn(IDemo.S);
	}

	
	@Test
	public void test() {
		System.out.println("Demo Greet :" +d.greet());
		assertEquals("Hello World", d.greet());
	}
	
	

}
