import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr)/2;
            if(a[pc]==key)
                return pc;
            else if(a[pc]<key)
                pl = pc+1;
            else
                pr = pc-1;
        } while(pl<=pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0;i<num;i++) {
            x[i] = i+1;
        }

        System.out.println("key : "); int key = sc.nextInt();

        int result = binSearch(x,num,key);

        if(result==-1) {
            System.out.println("해당 요소 없음");
        } else {
            System.out.println(result+"에 요소 있음");
        }
    }
}
