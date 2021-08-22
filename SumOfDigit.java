package Week2Day2Assignment;

public class SumOfDigit {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String replaceAll = text.replaceAll("\\D", "");
		System.out.println("Integers in String are: "+replaceAll);
		char[] rep = replaceAll.toCharArray();
		for (int i = 0; i < rep.length; i++) {
			int val = Character.getNumericValue(rep[i]);
			sum = sum + val;
		}
		System.out.println("Sum of integes: "+sum);

	}

}
