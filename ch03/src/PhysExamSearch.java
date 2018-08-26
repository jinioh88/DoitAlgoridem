import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    static class PhyscData {
        private String name;
        private int height;
        private double vision

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparable<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height>o2.height) ? 1:(o1.height<o2.height)?-1:0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("김사나",165,1.2),
            new PhyscData("유정연",162,1.0),
            new PhyscData("쯔위",170,2.0),
            new PhyscData("모모",161,1.1),
            new PhyscData("지효",165,0.9)
        };
        System.out.println("cm : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("",height,0.0),PhyscData.HEIGHT_ORDER);
        if(idx<0)
            System.out.println("요소가 없다.");
        else {
            System.out.println(idx);
            System.out.println(x[idx]);
        }
    }
}
