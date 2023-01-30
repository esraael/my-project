package test7;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter your size");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int length = 1, ans = 1;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else if (arr[i] + 1 == arr[i + 1]) {
                length++;
            } else {
                length = 1;
            }
            ans = Math.max(ans, length);

        }
        System.out.println("the longest length =" + ans);

    }
}
