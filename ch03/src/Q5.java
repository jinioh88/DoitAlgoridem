import java.util.Scanner;

public class Q5 {
    static int binSearchX(int[] a, int n, int key) {
        int lf = 0;
        int lr = n-1;
        int lc = (lf+lr)/2;

        do {
            if(a[lc]==key) {
                for(int i=0;i<lc;i++) {
                    if(a[i]==key)
                        return i;
                }
                return lc;
            } else if(a[lc]>key) {
                lr = lc-1;
            } else {
                lf = lc +1;
            }
        } while(lf<=lr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {1,3,5,17,7,7,7,8,8,9,9};

        int result = binSearchX(x,11,7);

        if(result==-1) {
            System.out.println("해당 요소 없음");
        } else {
            System.out.println(result+"에 요소 있음");
        }
    }
}
