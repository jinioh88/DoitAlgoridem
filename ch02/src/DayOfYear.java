import java.util.Scanner;

public class DayOfYear {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}
    };

    static int isLeap(int year) {
        return (year%4==0 && year%100!=0 || year%400==0) ? 1:0;
    }

    static int dayOfYear(int y, int m, int d) {
        if(isLeap(y)==1) {
            while(m>1) {
                m--;
                d += mdays[1][m-1];
            }
        } else {
            while(m>1) {
                m--;
                d += mdays[0][m-1];
            }
        }
        return d;
    }

    static int leftDayOfYear(int y, int m, int d) {
        int left = 0;
        if(isLeap(y)==1) {
            left = 366 - dayOfYear(y,m,d);
        } else {
            left = 365 - dayOfYear(y,m,d);
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println(dayOfYear(year,month,day));
        System.out.println(leftDayOfYear(2018,12,31));
    }
}
