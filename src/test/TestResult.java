package test;

import domain.Exercise;

/**
 * ���������� ����������� �����
 * 
 * @author olya_skrypnyk
 *
 */
public class TestResult {
	/**
	 * ���������� �������� ���������� �����
	 * 
	 * @param args �������� ������� ��������.
	 */
	public static void main(String[] args) {

		int R = -35;
		System.out.println("number = " + R + ", " + Exercise.Calculate(R));
	}
}
