package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 210;
        int j = 102;
        int k = -10;

        if (i > j) {
            if (i > 200) {
                if (j > 100) {
                    k = 3;
                } else {
                    k = 2;
                }
            } else if (!(j > 100)) {
                k = 1;
            }
        } else if (!(i > j) && !(i > 200) && !(j > 100)) {
            k = 4;
        }

        System.out.println("k = " + k);
    }
}
