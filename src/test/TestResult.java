package test;

import domain.Exercise;

/**
 * Тестування розроблених класів
 * 
 * @author olya_skrypnyk
 *
 */
public class TestResult {
	/**
	 * Обчислення значеннь обчислених даних
	 * 
	 * @param args параметр запуску програми.
	 */
	public static void main(String[] args) {

		int R = -35;
		System.out.println("number = " + R + ", " + Exercise.Calculate(R));
	}
}
