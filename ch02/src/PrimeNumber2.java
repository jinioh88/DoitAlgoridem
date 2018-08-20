import java.util.Arrays;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 횟수
        int ptr = 0; // 소소의 갯수
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for(int n=3; n<=1000; n+=2) {
            int i;
            for(i=1;i<ptr;i++) {
                counter++;
                if(n%prime[i]==0) {
                    break;
                }
            }
            if(ptr==i)
                prime[ptr++] = n;
        }

        System.out.println(Arrays.toString(prime));
    }
}
