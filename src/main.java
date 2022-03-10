import lab1.LifeLength;

public class main {
	public static void main(String[] args) {
		int n = 6;
		int first = 0;
		if (n == 1 || n == 2) {
			first = Integer.parseInt(args[0]);
		}
		switch (n) {
		case 1:
			LifeLength.upg1(first);
			break;
		case 2:
			LifeLength.upg2(first);
			break;
		case 3:
			LifeLength.upg3();
			break;
		case 4:
			LifeLength.upg4();
			break;
		case 6:
			LifeLength.upg6();
			break;
		default:
			System.out.println("Error: Number need to be 1,2,3,4 or 6.");
		}
	}
}
