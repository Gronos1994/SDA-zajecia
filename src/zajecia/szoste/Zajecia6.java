package zajecia.szoste;

import zajecia.czwarte.ZadaniaZeScannerem;

/**
 * Created by RENT on 2017-02-07.
 */
public class Zajecia6 {
    public static void main(String[] args) {
        //int numberOfElement = avgUntil(4);
        //System.out.println("Podano " + numberOfElement + "liczb.");
    calculator();
    }

    public static void calculator() {

        boolean flag = true;

        while (flag) {
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            int nrDzialania = ZadaniaZeScannerem.getNumberFromUser("Podaj numer działania");
                int firstNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj pierwszą liczbę:");
                int secondNumber = ZadaniaZeScannerem.getNumberFromUser("Podaj drugą liczbę:");
            switch (nrDzialania) {
                case 1:
                    System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber * secondNumber);
                    break;
                case 4:
                    System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber);
                    if (secondNumber == 0) {

                        System.out.println("Złe dane");
                    } else {
                        System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber);
                    }
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Złe dane");
                    break;
            }
        }
    }

    public static int sumUntil(int sum) {
        int tmpSum = 0;
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int number = ZadaniaZeScannerem.getNumberFromUser();
            tmpSum += number;
            counter++;
            if (tmpSum > sum) {
                flag = false;
            }
        }
        return counter;
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int counter = 0;
        int sum = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            counter++;
            if ((double) sum / counter > avg) {
                flag = false;
            }
        }
        return counter;
    }
}