package zajecia;

/**
 * Created by RENT on 2017-02-04.
 */
public class Zajecia4 {
    public static void statistics
    public static void main(String[] args) {
        System.out.println("Hello pppppp");
        int number = 16;
        System.out.println(number + number);

        if (number == 8) {
            System.out.println("Udalo sie");
        } else {
            System.out.println("Nie udalo sie");
        }
        if (0 == (number % 2)) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }
        int[] array = {1, 2, 3, (-3), 5};
        System.out.println(array[4]);
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[3]);

//        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i< array.length; i++) {
            int a = array[i];
            System.out.println(a);

        }
    }
    public static int numberOfEven (int[]array){
        int counter = 0
                for (int i = 0; i < array.length; i++){
                    if (isEven (array[i])){
                        counter++;
                    }
                }
    }



}