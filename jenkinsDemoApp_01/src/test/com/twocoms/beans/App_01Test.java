package test.com.twocoms.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twocoms.beans.App_01;

public class App_01Test {
	
	App_01 app;
	
	@Before
	public void init()
	{
		app = new App_01();
	}
	
	@After
	public void cleanup()
	{
		app = null;
	}

	@Test
	public void testAdd() {
		
		int actual = app.add(5, 10);
		int expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiple() {
		
		int actual = app.multiple(5, 10);
		int expected = 50;
		assertEquals(expected, actual);
		
	}

}
