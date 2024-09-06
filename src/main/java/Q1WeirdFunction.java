// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static void main(String[] args) {
        System.out.println(fRecursive(0));
        System.out.println(fRecursive(1));
        System.out.println(fRecursive(2));
        System.out.println(fRecursive(3));
        System.out.println(fRecursive(4));

        System.out.println(fIterative(0));
        System.out.println(fIterative(1));
        System.out.println(fIterative(2));
        System.out.println(fIterative(3));
        System.out.println(fIterative(4));
    }

    public static int fRecursive(int n) {
        if(n < 3) return n;

        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        if(n < 3) return n;

        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2] + 3 * arr[i - 3];
        }

        return arr[n];
    }
}