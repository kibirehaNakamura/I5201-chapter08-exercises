public class Q8_4 {
	public static void main(String[] args) {
		int total;
		int a1;
		int a2;
		
		Calc7 cl = new Calc7();
		
		a1 = Integer.parseInt(args[0]);
		a2 = Integer.parseInt(args[1]);
		
		total = cl.add(a1, a2);
		System.out.println(a1 + " + " + a2 + " = " + total);
		
		total = cl.sub(a1, a2);
		System.out.println(a1 + " - " + a2 + " = " + total);
	}
}