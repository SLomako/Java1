package lomakosv.ru;

public class Java1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer a = 10;
        Integer b = 20;

        System.out.println("a + b  = " + (a + b));
        System.out.println("a - b  = " + (a - b));
        System.out.println("a * b  = " + (a * b));
        System.out.println("b / a  = " + (b / a));
        System.out.println("b % a  = " + (b % a));
        System.out.println("a % b  = " + (a % b));

        System.out.println("a++    = " + (a++));
        System.out.println("a--    = " + (a--));
        System.out.println("++a    = " + (++a));
        System.out.println("--a    = " + (--a));

        System.out.println("a += 1 = " + (a + 1));
        System.out.println("a -= 1 = " + (a - 1));
        System.out.println("a *= 2 = " + (a * 2));
        System.out.println("a /= 2 = " + (a / 2));
        System.out.println("a %= 2 = " + (a % 2));

        System.out.println("a != b = " + (a != b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a >= b = " + (a >= b));

        byte maxByte = Byte.MAX_VALUE;
        int i1 = 1;
        byte nPlusMaxByte = (byte) (i1 + maxByte);
        System.out.println("aByte + maxByte = " + nPlusMaxByte);

        double d = 1.0;
        int i2 = 1;
        System.out.println("d + i = " + (d + i2));
        System.out.println("d + i = " + d + i2);


    }
}