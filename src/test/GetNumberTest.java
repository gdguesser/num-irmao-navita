package test;

import io.GetNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetNumberTest {

	@Test
	public void searchBiggestNumberTest() {
		String[] sentValue = new String[1];

		sentValue[0] = "123";
		
		String waitedReturn = "321";
		
		String returnObtained = GetNumber.searchBiggestNumber(sentValue);
		
		Assertions.assertEquals(waitedReturn, returnObtained);
		
		String[] sentValue2 = new String[1];
		sentValue2[0] = "553";
		
		String waitedReturn2 = "553";
		
		String returnObtained2 = GetNumber.searchBiggestNumber(sentValue2);
		
		Assertions.assertEquals(waitedReturn2, returnObtained2);
	}

}
