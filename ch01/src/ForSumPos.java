import java.util.Scanner;

public class ForSumPos {
    public static void main(String[] args) {
        //min();
        System.out.println(countJa(1350));
    }

    public static int min() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("a 보다 큰값 입력 : "); int b = sc.nextInt();

        while(b<=a) {
            System.out.print("a 보다 큰값 입력 : "); b = sc.nextInt();
        }

        System.out.println("b-a = "+(b-a));
        return b-a;
    }

    public static int countJa(int n) {
        int count = 0;
        if(n==0)    return 0;
        do {
            count++;
            n /= 10;
        }while(n!=0);

        return count;
    }
}
