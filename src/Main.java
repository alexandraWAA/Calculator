
import service.Switch;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(in);
        System.out.print("Введите выражение : ");
        String input = scan.nextLine();
        System.out.println("Input: " + "\n" + input);
        in.close();
        input = input.replaceAll("\\s", "");
        String[] arabicNumber = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romeNumber = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] s1 = input.split(":|#|@|!|\\?|\\+|-|\\*|/|=|;|\\.|,|^");
        String s2 = input.replaceAll("[a-zA-Z0-9]", "");
        Switch method = new Switch();
        char[] s = s2.toCharArray();
        /*
        Проверка на ошибки, конвертация.
         */
        if (s.length != 1 || s1.length != 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Output: "+ "\n" + "throws Exception // Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        boolean found4 = false;
        String str1 = s1[0];
        String str2 = s1[1];
        String str3 = s2;
        for (String a : arabicNumber) {
            if (a.equalsIgnoreCase(str1)) {
                found1 = true;
                break;
            }
        }
        for (String b : arabicNumber) {
            if (b.equalsIgnoreCase(str2)) {
                found2 = true;
                break;
            }
        }
        for (String c : romeNumber) {
            if (c.equalsIgnoreCase(str1)) {
                found3 = true;
                break;
            }
        }
        for (String d : romeNumber) {
            if (d.equalsIgnoreCase(str2)) {
                found4 = true;
                break;
            }
        }
        int result;
        int firstNumber;
        int secondNumber;
        /*
При вводе арабских чисел
         */
        if (found1 == true && found2 == true) {
            int[] numbers = new int[s1.length];
            for (int i = 0; i < s1.length; i++) {
                numbers[i] = Integer.parseInt(s1[i]);
            }
            firstNumber = numbers[0];
            secondNumber = numbers[1];
            result = method.function(str3, firstNumber, secondNumber);
            System.out.println("Output: "+ "\n" + result);
        } else if (found3 == true && found4 == true) {
            firstNumber = method.switchMethodForRome(str1.toUpperCase());
            secondNumber = method.switchMethodForRome(str2.toUpperCase());
            result = method.function(str3, firstNumber, secondNumber);
            if (result < 1) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Output: "+ "\n" + "throws Exception // В римской системе нет отрицательных чисел и нуля");
                }
            }
            String outputResult = method.convertationRomeNumberToString(result);
            System.out.println("Output: "+ "\n" + outputResult);
        } else {

            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Output: "+ "\n" + "throws Exception // Используются одновременно разные системы счисления или некорректно введены данные. Необходимо ввести число от 1 до 10 или от I до X!");
            }
        }
    }
}
