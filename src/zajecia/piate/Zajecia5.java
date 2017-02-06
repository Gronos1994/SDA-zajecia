package zajecia.piate;

import org.w3c.dom.css.Counter;
import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

/**
 * Created by RENT on 2017-02-06.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        Random random = new Random();
        int wynik = game(random.nextInt(100));
        wynik = game(100);
        System.out.println("Koniec gry.");
        System.out.println("Liczba kroków: " + wynik);
    }

    public static int[] arrayNumbersFromUser() {
        int[] tmpArray = new int[100];
        boolean flag = true;
        int size = 0;
        int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number");
        while (flag) {
            if (numberFromUser != 0) {
                tmpArray[size] = numberFromUser;
                size++;

            } else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }

    public static int game(int game) {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj liczbę");
            counter++;
            if (numberFromUser > game) {
                System.out.println("Podana liczba jest za duża, spróbój ponownie");
            } else if (numberFromUser < game) {
                System.out.println("Podana liczba jest za mała, spróboj ponownie");
            } else {
                flag = false;
            }
        }
        return counter;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
        }
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }


    public static int sumOfNumbersFromUser() {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number");
            if (numberFromUser != 0) {
                sum += numberFromUser;
            } else {
                flag = false;
            }
        }
        return sum;
    }

    public static void triangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {

                System.out.print(" ");

            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");

            }

            System.out.println();

        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");

        }
        for (int j = 0; j < number - 1; j++) {
            System.out.print(" ");
        }
        System.out.println();

    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();

        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {


            for (int j = 0; j < number; j++) {
                if (j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }

    }
}
