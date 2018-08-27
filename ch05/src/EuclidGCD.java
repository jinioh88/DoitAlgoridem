public class EuclidGCD {
    public int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) {
        EuclidGCD app = new EuclidGCD();
        System.out.println(app.gcd(22,8));
    }
}
