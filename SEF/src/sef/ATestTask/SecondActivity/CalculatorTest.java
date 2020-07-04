package sef.ATestTask.SecondActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	private Calculator testCalculator = new Calculator();
	
	public void testGetSum() {
			int a = 5;
			int b = 2;			
			
			assertEquals(7, (testCalculator.getSum(a,b)));
			assertEquals(7, (testCalculator.getSum(b,a)));		

			a = -5;		
			b = 10;		
			
			assertEquals(5, (testCalculator.getSum(a,b)));
			assertEquals(5, (testCalculator.getSum(b,a)));
			
			a = -5;		
			b = -10;		
			
			assertEquals(-15, (testCalculator.getSum(a,b)));
			assertEquals(-15, (testCalculator.getSum(b,a)));
		}

		public void testGetDifference() {
			
			int a = 3;
			int b = 2;		
			
			assertEquals(1, (testCalculator.getDifference(a,b)));		
			
			assertEquals(-1, (testCalculator.getDifference(b,a)));

			a = 5;
			b = -4;
			
			assertEquals(9, (testCalculator.getDifference(a,b)));		
			
			assertEquals(-9, (testCalculator.getDifference(b,a)));	
		
			a = -10;
			b = -5;
			
			assertEquals(-5, (testCalculator.getDifference(a,b)));		
			
			assertEquals(5, (testCalculator.getDifference(b,a)));			
		}

		public void testGetProduct() {
			
			int a = 5;
			int b = 10;			
			
			assertEquals(50, (testCalculator.getProduct(a,b)),0);
			assertEquals(50, (testCalculator.getProduct(b,a)),0);		

			a = -5;		
			b = 10;		
			
			assertEquals(-50, (testCalculator.getProduct(a,b)),0);
			assertEquals(-50, (testCalculator.getProduct(b,a)),0);
			
			a = -3;		
			b = -10;		
			
			assertEquals(30, (testCalculator.getProduct(a,b)),0);
			assertEquals(30, (testCalculator.getProduct(b,a)),0);
		}

		public void testGetQuotient() {

			int a = 10;	int b = 5;		
			
			assertEquals(2, (testCalculator.getQuotient(a,b)),0);		
			
			assertEquals(0.5, (testCalculator.getQuotient(b,a)),0);

			a = 9;	b = -3;
			
			assertEquals(-3, (testCalculator.getQuotient(a,b)),0);		
			
			assertEquals(-0.33, (testCalculator.getQuotient(b,a)),0.007);	
		
			a = -10;	b = -5;
			
			assertEquals(2, (testCalculator.getQuotient(a,b)),0);		
			
			assertEquals(0.5, (testCalculator.getQuotient(b,a)),0);			
			}
			
		
}
