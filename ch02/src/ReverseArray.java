import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[] a) {
        for(int i=0;i<a.length/2;i++) {
            System.out.println(i+"와 "+(a.length-i-1) +"를 교환");
            swap(a, i, a.length-1-i);
        }
    }

    static void swap(int[] a, int ind1, int ind2) {
        int temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
        System.out.println(Arrays.toString(a));
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int n:a) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("요오 수: "); int num = scanner.nextInt();

        int[] x = new int[num];

        for(int i=0;i<num;i++) {
            x[i] = random.nextInt(90);
        }

        System.out.println(Arrays.toString(x));
        reverse(x);

        System.out.println("배열의 합계 : "+sumOf(x));
    }
}
