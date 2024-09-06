public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        if(i < 1) return;
        
		System.out.print(array[i - 1] + "\n");

		printRecursion(i - 1);
    }
}