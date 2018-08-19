import java.util.Scanner;

public class Max3m {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기.");
        System.out.println(max(19,29,93));
    }

    static int max(int a, int b, int c) {
        int max = a;

        if(b>max)
            max = b;
        if(c>max)
            max = c;

        return max;
    }
}
