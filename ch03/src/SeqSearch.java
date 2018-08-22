import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        for(int i=0;i<n;i++) {
            if(a[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0;i<num;i++) {
            x[i] = i;
        }

        System.out.println("검색할 거 : ");
        int key = sc.nextInt();

        int result = seqSearch(x,num,key);

        if(result==-1) {
            System.out.println("해당 요소 없음!");
        } else {
            System.out.println(result+"번쨰 요소에 데이터 있음");
        }
    }
}
