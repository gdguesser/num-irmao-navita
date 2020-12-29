package io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import util.NumberValidation;

public class GetNumber {

	public static void init(String[] numericValue) {
		System.out.println(NumberValidation.isValidNumber(numericValue) ? searchBiggestNumber(numericValue) : "-1");
	}

	public static String searchBiggestNumber(String[] numericValue) {
		List<Integer> array = new ArrayList<Integer>();
		String stringNumericValue = String.valueOf(Integer.parseInt(numericValue[NumberValidation.INITIAL_POSITION]));

		for (int i = 0; i < stringNumericValue.length(); i++) {
			array.add(Integer.valueOf(Character.toString(stringNumericValue.charAt(i))));
		}
		
		Collections.sort(array);
		Collections.reverse(array);
		
		return array.toString().replaceAll("\\D*", "").trim();
	}

}
