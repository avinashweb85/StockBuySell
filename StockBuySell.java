
public class StockBuySell {

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6,  4};
		System.out.println("Max Profit : " + getMax(arr));
	}

	public static int getMax(int arr[]) {

		int max = 0;
		int current = arr[0];

		for (int i = 1; i < arr.length; i++) {
			System.out.println("arr[i] : " + arr[i] + " current :" + current);
			
			max = Math.max(max, arr[i] - current);
			
			System.out.println("max : " + max);
			
			current = Math.min(current, arr[i]);
			
			System.out.println("current : " + current);
		}

		return max;
	}
}
