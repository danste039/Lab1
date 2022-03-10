package lab1;

public class LifeLength {
	public static int f1(int a0) {
		if (a0 == 1) {
			return a0;
		}
		if (a0 % 2 == 0) {
			return a0 / 2;
		} else {
			return (a0 * 3) + 1;
		}
	}

	public static int f2(int a0) {
		return f1(f1(a0));
	}

	public static int f4(int a0) {
		return f2(f2(a0));
	}

	public static int f8(int a0) {
		return f4(f4(a0));
	}

	public static int f16(int a0) {
		return f8(f8(a0));
	}

	public static int f32(int a0) {
		return f16(f16(a0));
	}

	public static int interateF(int a0, int n) {
		int a = a0;
		for (int i = 0; i < n; i++) {
			a = f1(a);
		}
		return a;
	}

	public static int iterLifeLength(int a0) {
		int life = 0;
		int a = a0;
		while (a != 1) {
			a = f1(a);
			life += 1;
		}
		return life;
	}

	public static String intsToString(int X, int Y) {
		return "(Iterativ)The life length of " + X + " is " + Y + ".";
	}

	public static int recLifeLength(int x) {
		if (x == 1) {
			return 0;
		} else {
			return recLifeLength(f1(x)) + 1;
		}
	}

	public static String recIntsToString(int X, int Y) {
		return "(Recursive)The life length of " + X + " is " + Y + ".";
	}

	public static void upg1(int a0) {
		int a1 = f1(a0);
		System.out.println(a1);
	}

	public static void upg2(int a0) {
		int a1 = f1(a0);
		int a2 = f2(a0);
		int a4 = f4(a0);
		int a8 = f8(a0);
		int a16 = f16(a0);
		int a32 = f32(a0);
		System.out.println("f1=" + a1 + " f2=" + a2 + " f4=" + a4 + " f8=" + a8 + " f16=" + a16 + " f32=" + a32);
	}

	public static void upg3() {
		int a1 = interateF(3, 5);
		int a2 = interateF(42, 3);
		int a3 = interateF(1, 3);
		System.out.println("interateF(3,5) =" + a1);
		System.out.println("interateF(42,3) =" + a2);
		System.out.println("interateF(1,3) =" + a3);
	}

	public static void upg4() {
		for (int i = 1; i < 16; i++) {
			int l1 = iterLifeLength(i);
			String str = intsToString(i, l1);
			System.out.println(str);
		}
	}

	public static void upg6() {
		for (int i = 1; i < 16; i++) {
			int l1 = iterLifeLength(i);
			int l2 = recLifeLength(i);
			String str = intsToString(i, l1) + recIntsToString(i, l2);
			System.out.println(str);
		}
	}
}
