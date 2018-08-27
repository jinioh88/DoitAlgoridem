import java.util.Scanner;

public class Hanoi {
    static void move(int no, int x, int y) {
        if(no>1) {
            move(no-1,x,6-x-y);
        }
        System.out.println("원반"+no+"를 "+x+"에서 "+y+"로 옮김");
        if(no>1) {
            move(no-1,6-x-y,y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        move(n,1,3);
    }
}
