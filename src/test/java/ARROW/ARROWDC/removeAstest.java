package ARROW.ARROWDC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeAstest {


	RemoveA green;
	
	@BeforeEach
	void setup()
	{
		green =new RemoveA();
	}
	@Test
	void test() {
		assertEquals("AA",green.Removea("AAAA"));
	}
	@Test
	void test1() {
		assertEquals("B",green.Removea("AB"));
	}
	@Test
	void test2() {
		assertEquals("",green.Removea("A"));
	}
	@Test
	void test3() {
		assertEquals("",green.Removea(""));
	}
	@Test
	void test4() {
		assertEquals("nmji",green.Removea("nmji"));
	}


}
