package zajecia.siodme;

import zajecia.czwarte.ZadaniaZeScannerem;

import javax.sql.rowset.serial.SerialStruct;
import java.util.Random;

/**
 * Created by RENT on 2017-02-08.
 */
public class Zajecia7 {
    public static void main(String[] args) {
//        int[] statistics = stringStatistics("dzień dobry");
//        printStringStatistics(statistics);
        //String randomString = randomLowerCase(10);
        //int[] statistics = stringStatistics(randomString);
        // reverseString("test");
//        printStringStatistics(reverseString;
        String message = "Ala ma 3 koty i 2 psy";
        int sum = sumFromString(message);
        System.out.println("Ala ma" + sum + "zwierząt");
    }

    public static int[] stringStatistics(String message) {
        //wielkość tablicy
        char[] charArray = message.toCharArray();
        int[] statisticsArray = new int[26];
        for (int i = 0; i < message.length(); i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generateValue = random.nextInt(26) + 97;
            stringBuilder.append((char) generateValue);
        }
        return stringBuilder.toString();
    }

    public static String converSpaces(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = ' ';
            }
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int sumFromString(String message) {
        char[] charArray = message.toCharArray();
        int sumFromString = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sumFromString += (int) (charArray[i] - 48);
            }

        }
        return sumFromString;
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }
        return String.valueOf(charArray);
    }
}
