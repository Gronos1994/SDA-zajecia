package zajecia.osme;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {

    public static void main(String[] args) {
        // System.out.println(factorial(1));
        System.out.println(fibonacciCodeRec(0));
        System.out.println(fibonacciCodeRec(1));
        System.out.println(fibonacciCodeRec(2));
        System.out.println(fibonacciCodeRec(4));
        System.out.println(fibonacciCodeRec(5));
        System.out.println(fibonacciCodeRec(6));
    }

    public static long factorial(int number) {
        long tmp = 1;
        for (int i = 1; i <= number; i++) {
            tmp *= i;
        }
        return tmp;

    }

    public static int fibonacciCode(int index) {
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 0; i < index; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }

    public static int fibonacciCodeRec(int index) {
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciCodeRec(index - 2) + fibonacciCodeRec(index - 1);
    }


    public static long facotrialRecursion(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * facotrialRecursion(number - 1);
    }
}
