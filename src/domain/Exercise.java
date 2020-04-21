package domain;

/**
 * ���������� ����������
 * 
 * @author olya_skrypnyk
 */
public class Exercise {
	/**
	 * ����������� ����� � ����� �������� ����������
	 * 
	 * @param n ������� �����
	 * @return ����� ������� ����� � ����� �������� ����������
	 */
	public static String Calculate(int n) {

		return "Bin - " + calcBin(n) + "; Oct - " + calcOct(n) + "; Hex - " + calcHex(n);
	}

	/**
	 * ������� ����� � ���������������� �������
	 * 
	 * @param val - ������� �����
	 * @return ����� � ������ � ������������������ �����������
	 */
	private static String calcHex(int val) {
		return Integer.toHexString(val);
	}

	/**
	 * ������� ����� � ����������� �������
	 * 
	 * @param val - ������� �����
	 * @return ����� � ������ � ������������� �����������
	 */
	private static String calcOct(int val) {
		return Integer.toOctalString(val);
	}

	/**
	 * ������� ����� � ������� ������� �������
	 * 
	 * @param val - ������� �����
	 * @return ����� � ������ � ��������� �����������
	 */

	private static String calcBin(int val) {
		return Integer.toBinaryString(val);
	}
}
