package zajecia.czwarte;

import zajecia.Zajecia1;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * Created by RENT on 2017-02-04.
 */
public class ZadaniaZeScannerem {
    public static void main(String[] args) {
        listNumbersFromUsers();
        compareThreeNumber();
        listNumbersFromUsers();
    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert numbers of grades.");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1)"grade:");
        }
        int avg = Zajecia4.avg(array);
    }

}

    public static void listEvenNumberFromUser() {
        //pobieramy liczbe
        //wyswietlamy tylko parzyste mniejsze od
        int number = getNumberFromUser();
        Zajecia4.printEvenLessThan(number);
        System.out.println(number);
    }

    public static void listNumbersFromUsers() {
        int number = getNumberFromUser();
        Zajecia4.printLessThan(number);
    }

    public static void compareThreeNumber() {
        int a = getNumberFromUser(" Insert First Number");
        int b = getNumberFromUser("Insert Second Number");
        int c = getNumberFromUser("Insert Third number");
        System.out.println("Max " + max(a, b, c));
        System.out.println("Min " + min(a, b, c));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max > array[1]) {
                return max;
            }
        }
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);


    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }


    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert your number:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number");
        return scanner.nextInt();
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number");
        return scanner.nextInt();
    }

    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number:");
        ;
        int numberFromUser = scanner.nextInt();
        if (Zajecia4.isEven(getNumberFromUser())) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        System.out.println("Please insert your name.");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name");
        String lastName = scanner.nextLine();
    }

}