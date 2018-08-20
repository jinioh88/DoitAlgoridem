import java.util.Arrays;
import java.util.Scanner;

public class CardConvRev {
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
          d[digits++] = dchar.charAt(x%r);
          x /= r;
        }while(x!=0);

        return digits;
    }

    static void cardConv(int x, int r, char[] d) {
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;

        d[count++] = dchar.charAt(x%r);
        x /= r;

        do {
            for(int i=count;i>0;i--) {
                d[i] = d[i-1];
            }
            d[0] = dchar.charAt(x%r);
            x /= r;
            count++;
        }while(x!=0);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; int cd; int dno;
        char[] cno = new char[32];
        no = scanner.nextInt();
        cd = scanner.nextInt();

//        dno = cardConvR(no, cd, cno);
//
//        for(int i=dno-1;i>=0;i--) {
//            System.out.println(cno[i]);
//        }

        cardConv(no,cd, cno);
        System.out.println(Arrays.toString(cno));
    }
}
