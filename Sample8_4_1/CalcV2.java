public class CalcV2 {
	public int add(int number) {
		int total = 0;
		
		for(int i = 1; i <= number; i++) {
			total += i;
		}
		
		return total;
	}
	
	
	public int factorial(int number) {
		int total = 1;
		if(number < 0 || 12 < number) {
			System.out.println(number + "では、正しい階乗を求められません");
			total = -1;
		} else {
			for(int i = 2; i <= number; i++) {
				total *= i;
			}
		}
		
		return total;
	}
}