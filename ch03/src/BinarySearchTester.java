import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];
        for(int i=0;i<num;i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("검색 값 : "); int key = sc.nextInt();

        int idx = Arrays.binarySearch(x,key);
        if(idx<0)
            System.out.println(idx);
        System.out.println(idx);
    }
}
