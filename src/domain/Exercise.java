package domain;

/**
 * ќбчисленн€ результат≥в
 * 
 * @author olya_skrypnyk
 */
public class Exercise {
	/**
	 * «находженн€ числа у р≥зних системах обчисленн€
	 * 
	 * @param n введене число
	 * @return р€док значень числа у р≥зних системах обчисленн€
	 */
	public static String Calculate(int n) {

		return "Bin - " + calcBin(n) + "; Oct - " + calcOct(n) + "; Hex - " + calcHex(n);
	}

	/**
	 * ѕеревод числа в ш≥стнадц€тиричну систему
	 * 
	 * @param val - введене число
	 * @return р€док з числом в ш≥стнадц€тиричному представлен≥
	 */
	private static String calcHex(int val) {
		return Integer.toHexString(val);
	}

	/**
	 * ѕеревод числа в восьмиричну систему
	 * 
	 * @param val - введене число
	 * @return р€док з числом в восьмиричному представлен≥
	 */
	private static String calcOct(int val) {
		return Integer.toOctalString(val);
	}

	/**
	 * ѕеревод числа в дв≥йкову систему систему
	 * 
	 * @param val - введене число
	 * @return р€док з числом в дв≥йковому представлен≥
	 */

	private static String calcBin(int val) {
		return Integer.toBinaryString(val);
	}
}
