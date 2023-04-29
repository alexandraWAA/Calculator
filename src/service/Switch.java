package service;

public class Switch {
    public int switchMethodForRome (String string) {
        int number;
        switch (string) {
            case ("I"):
                number = 1;
                break;
            case ("II"):
                number = 2;
                break;
            case ("III"):
                number = 3;
                break;
            case ("IV"):
                number = 4;
                break;
            case ("V"):
                number = 5;
                break;
            case ("VI"):
                number = 6;
                break;
            case ("VII"):
                number = 7;
                break;
            case ("VIII"):
                number = 8;
                break;
            case ("IX"):
                number = 9;
                break;
            case ("X"):
                number = 10;
                break;
            default:
                throw new IllegalStateException("Output: "+ "\n" + "throws Exception // Введена недопустимая переменная ");
        }
    return number;
    }
    public int function (String string, Integer number1, Integer number2) {
        int result;
        switch (string) {
            case ("+"):
                result = number1 + number2;
                break;
            case ("-"):
                result = number1 - number2;
                break;
            case ("*"):
                result = number1 * number2;
                break;
            case ("/"):
                result = number1 / number2;
                break;
            default:
                throw new IllegalStateException("Output: "+ "\n" + "throws Exception // Введен недопустимый оператор ");
        }
        return result;
    }
    public String convertationRomeNumberToString (Integer result) {
        String output;
        int n;
        int m;
        String firstPart = new String();
        String secondPart = new String();
        if (result > 0) {
            n = result % 10;
            m = result / 10;

            if (m < 4) {
                firstPart = "X".repeat(m);
            } else if (m > 4 && n < 9) {
                firstPart = "L"+"X".repeat(m-5);
            } else if (m > 8 && m < 11) {
                firstPart = ("X".repeat(10-m))+"C";
            } else {
                firstPart = "XL";
            }
            if (n < 4) {
                    secondPart = "I".repeat(n);
            } else if (n > 4 && n < 9) {
                    secondPart = "V"+"I".repeat(n-5);
            } else if (n == 9) {
                    secondPart = "IX";
            } else {
                    secondPart = "IV";
            }
            }
        return output = firstPart + secondPart;
        }
    }
