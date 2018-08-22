import java.util.Scanner;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int start = 0;
        for(int i=0; i<n;i++) {
            if(a[i]==key)
                idx[start++] = i;
        }

        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,9,2,9,4,6,7,9};
        int[] idx = new int[8];
        System.out.println(searchIdx(a,8,9,idx));
    }
}
