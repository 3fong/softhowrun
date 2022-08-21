import aaa;

/**
 * 进制转换造成的小数精度问题 10.000002
 */
public class NumPrecisionTest {

    public static void main(String[] args) {
        float num = 0;
        for(int i = 1;i<=100;i++) {
            num += 0.1;
        }
        System.out.println(num);
        float i = 2 >> 3;
        System.out.println((float)i);
    }
}