package util;

import java.util.regex.Pattern;

public class NumberValidation {
	public static final int MAX_INPUT_QUANTITY = 1;
	public static final int INITIAL_POSITION = 0;
	public static final int MAX_VALUE = 100000000;
	public static final int MIN_VALUE = 0;

	public static Boolean isValidNumber(String[] numericValue) {
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		Boolean booleanReturn = Boolean.FALSE;

		if (numericValue != null
				&& (numericValue.length <= MAX_INPUT_QUANTITY
				&& numericValue.length > INITIAL_POSITION)) {
			int parsedNumericValue = Integer.parseInt(numericValue[INITIAL_POSITION]);
			
			booleanReturn = pattern.matcher(numericValue[INITIAL_POSITION]).matches()
					  && parsedNumericValue <= MAX_VALUE
					  && parsedNumericValue >= MIN_VALUE;
		}

		return booleanReturn;
	}

}
