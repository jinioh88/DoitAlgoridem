import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] a = new int[num];

        for(int i=0;i<a.length;i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[num];

        copy(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(equals(a,b) ? "같다" : "같지않다");
        rcopy(a,b);
        System.out.println(Arrays.toString(a));
    }

    static boolean equals(int[] a, int[] b) {
        if(a.length!=b.length)
            return false;
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }

    static void copy(int[] a, int[] c) {
        if(a.length!=c.length)
            return;
        for(int i=0;i<a.length;i++) {
            c[i] = a[i];
        }
    }

    static void rcopy(int[] a, int[] b) {
        for(int i=0; i<b.length; i++) {
            a[i] = b[b.length-1-i];
        }
    }
}
