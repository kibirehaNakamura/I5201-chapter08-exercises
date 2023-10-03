public class Practice8_2 {
	public static void main(String[] args) {
		int[] arrayScore = { 70, 85, 60, 65, 75 };
		Search sh = new Search();
		
		for(int i = 0; i < arrayScore.length; i++) {
			System.out.print("配列[" + i + "]=" + arrayScore[i] + " ");
		}
		System.out.println();
		
		System.out.println("配列要素中の最小値 = " + sh.minimum(arrayScore));
		System.out.println("配列要素中の最大値 = " + sh.maximum(arrayScore));
	}
}