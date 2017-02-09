package zajecia.osme;

import zajecia.siodme.Zajecia7;

/**
 * Created by RENT on 2017-02-09.
 */
public class Zajecia8 {

    public static void main(String[] args) {
        // System.out.println(factorial(1));
//
        System.out.println(startsWith3("Ala ma kota" ,"Ala "));
    }

    public static int sumOfNumberDigitsWithString(String message) {
        String numberAsString = String.valueOf(message);
        return Zajecia7.sumFromString(numberAsString);
    }

    public static boolean startsWith(String message, String expression) {
        return message.startsWith(expression);
    }

    public static boolean startsWith2(String message, String expression) {
        return message.substring(0, expression.length()) == expression;
    }

    public static boolean startsWith3 (String message, String expression) {
        char[] array = message.toCharArray();
        char[] expressionArray = expression.toCharArray();
        for (int i = 0; i < expressionArray.length; i++) {
            if (array[i] != expressionArray[i]) {
                return false;
            } else {
            }
        }
        return true;
    }

    public static int sumOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }

        }
        return String.valueOf(charArray);
    }

    public static String switchCaseWithBuilder(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if (tmp >= 65 && tmp <= 90) {
                stringBuilder.append((char) (tmp + 32));
            } else if (tmp >= 97 && tmp <= 122) {
                stringBuilder.append((char) (tmp - 32));
            } else {
                stringBuilder.append(tmp);
            }

        }
        return stringBuilder.toString();
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
