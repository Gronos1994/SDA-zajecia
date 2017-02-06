package zajecia.piate;

/**
 * Created by RENT on 2017-02-06.
 */
public class Zajecia5 {
    public static void main(String[] args) {
        evenMatrix(5);
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