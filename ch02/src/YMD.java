
public class YMD {
    private int y;
    private int m;
    private int d;

    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public static YMD after(int n) {
        YMD ymd = new YMD(2018,8,28);
        int d=0;
        int m=0;
        if(n+28>=31) {
            d = n+28-31;
            m = 9;
        } else
            d = n+28;
        ymd.m = m;
        ymd.d = d;
        return ymd;
    }

    public static void main(String[] args) {
        YMD ymd = after(13);
        System.out.println(ymd.m);
    }
}
