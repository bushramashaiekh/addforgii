package addforgi;
import static org.junit.Assert.*;

import org.junit.Test;




class test {

	@Test
	void test() {
		
		fail("Not yet implemented");
	}
	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		addforgi calc = new addforgi();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);
		}

}