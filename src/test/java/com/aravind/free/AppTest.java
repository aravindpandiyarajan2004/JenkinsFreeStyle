package com.aravind.free;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		//fail("Not yet implemented");
		assertEquals(1,App.CompareString("Aravind", "Aravind"));
	}
	
	@Test
	void testCompareString1() {
		assertEquals(0,App.CompareString("Aravind", "ARavind"));
	}
	
	@Test
	void testSum() {
		int a[] = {1,2,3,4};
		assertEquals(10,App.sum(a));
	}
	
	
	
	@Test
	void test() {
		assertTrue(App.StringCmpr("aravind", "aravind"));
		
	}
	
	@Test
	void test2() {
		assertFalse(App.StringCmpr("Aravind", "aravind"));
		
	}

}
