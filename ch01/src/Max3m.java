import java.util.Scanner;

public class Max3m {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값 구하기.");
        System.out.println(max(19,29,93));
        System.out.println(max4(10,20,30,21));
        System.out.println(min3(10,22,14));
    }

    static int max(int a, int b, int c) {
        int max = a;

        if(b>max)
            max = b;
        if(c>max)
            max = c;

        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;
        if(d>max)
            max = d;
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(b<min)   min = b;
        if(c<min)   min = c;
        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b<min)   min = b;
        if(c<min)   min = c;
        if(d<min)   min = d;
        
        return min;
    }
}
