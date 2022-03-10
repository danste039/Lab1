package lab1;

import java.lang.Math;

public class Raise {
	public static int count = 0;
	public static int count2 = 0;

	public static double recRaiseOne(double x, int k) {

		if (k == 0) {
			return 1.0;
		} else {
			count2 += 1;
			return x * recRaiseOne(x, k - 1);
		}
	}

	public static double recRaiseHalf(double x, int k) {

		if (k == 0) {
			return 1;
		}
		if (k % 2 == 0) {
			count += 1;
			double even = recRaiseHalf(x, k / 2);
			return even * even;
		} else {
			count += 1;
			double unEven = recRaiseHalf(x, k / 2);
			return x * unEven * unEven;
		}
	}

	public static int lifeOne(int k) {
		return k;
	}

	public static double lifeHalf(int k) {
		double ans = (Math.log(k) / Math.log(2));
		double answer = Math.ceil(ans);
		return answer;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 8000; i++) {
			double ans1 = recRaiseHalf(1.5, i);
			double ans2 = recRaiseOne(1.5, i);
			System.out.println("recRaiseHalf = " + ans1 + " number of calls: " + count + " for k: "+i);
			System.out.println("recRaiseOne = " + ans2 + " number of calls: " + count2 + " for k: "+i);

			count = 0;
			count2 = 0;
		}

		/*
		 * for (int i = 1; i <= 10000; i++) { 
		 * double ans1 = recRaiseHalf(1.0005, i);
		 * double ans2 = recRaiseOne(1.0005, i); 
		 * System.out.println("recRaiseHalf = " + ans1 + " number of calls: " + count + " for k: "+i);
		 * System.out.println("recRaiseOne = " + ans2 + " number of calls: " + count2 + " for k: "+i);
		 * 
		 * count = 0; count2 = 0; }
		 */
	}
}
