package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleTest {

	

		@Test
		public void simpleTestPass(){
			int a=1;
			int b=2;
			
			assertTrue(a+b==3);
		}
		

		@Test
		public void simpleTestFail(){
			int a=1;
			int b=2;
			
			assertFalse(a+b==4);
		}
		
}
