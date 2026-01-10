package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует консольный калькулятор!");
        while (true) {
            System.out.print("Введите выражение в формате 'число оператор число' числа от 1 до 10 (или 'QUIT' для выхода): ");
            String expression = scanner.nextLine();
            if (expression == null || expression.trim().isEmpty()) {
                System.out.println("Вы ввели пустую строку, попробуйте еще раз.");
                continue;
            }
            if ("QUIT".equalsIgnoreCase(expression.trim())) {
                System.out.println("Калькулятор завершил работу!");
                break;
            }
            try {
                String result = processExpression(expression);
                System.out.println("Ответ: " + result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static String processExpression(String input) {
        String[] parts = input.trim().split("\\s+");
        if (parts.length != 3) {
            throw new RuntimeException("Неверный формат выражения. Введите выражение в формате 'число оператор число'");
        }
        String number1 = parts[0];
        String operator = parts[1];
        String number2 = parts[2];
        if (!"+".equals(operator) && !"-".equals(operator) && !"*".equals(operator) && !"/".equals(operator)) {
            throw new RuntimeException("Неверный оператор. Введите '+', '-', '*' или '/'.");
        }
        boolean firstArabic = isArabic(number1);
        boolean secondArabic = isArabic(number2);
        boolean firstRoman = isRoman(number1);
        boolean secondRoman = isRoman(number2);
        if (firstArabic && secondArabic) {
            return calcArabic(number1, number2, operator);
        }
        if (firstRoman && secondRoman) {
            return calcRoman(number1, number2, operator);
        }
        if (firstArabic) {
            throw new RuntimeException("Один из операндов не является арабским числом");
        }
        if (firstRoman) {
            throw new RuntimeException("Один из операндов не является римским числом");
        }
        throw new RuntimeException("Операнды не распознаны как арабские или римские числа");
    }

    private static boolean isArabic(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String calcArabic(String op1, String op2, String oper) {
        int a = Integer.parseInt(op1);
        int b = Integer.parseInt(op2);
        if (a > 10 || b > 10) {
            throw new RuntimeException("Один из операндов больше 10");
        }
        if (a < 1 || b < 1) {
            throw new RuntimeException("Один из операндов меньше 1");
        }
        int res = applyOperation(a, b, oper);
        return String.valueOf(res);
    }

    private static int applyOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new RuntimeException("Деление на ноль запрещено!");
                }
            default:
                throw new RuntimeException("Неверный оператор. Введите '+', '-', '*' или '/'.");
        }
    }

    private static boolean isRoman(String s) {
        return s.matches("[IVXLC]+");   // Проверка на соответствие римскому числу без проверки на правильность записи
    }

    private static String calcRoman(String op1, String op2, String oper) {
        int a = romanToInt(op1);
        int b = romanToInt(op2);
        if (a > 10 || b > 10) {
            throw new RuntimeException("Один из операндов больше 10");
        }
        if (a < 1 || b < 1) {
            throw new RuntimeException("Один из операндов меньше 1");
        }
        int res = applyOperation(a, b, oper);
        return intToRoman(res);
    }

    private static int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = romanCharValue(s.charAt(i));
            if (val < prev) {
                result -= val;
            } else {
                result += val;
            }
            prev = val;
        }
        return result;
    }

    private static int romanCharValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            default:
                throw new RuntimeException("Некорректный символ римского числа: " + c);
        }
    }

    private static String intToRoman(int number) {
        if (number <= 0) {
            throw new RuntimeException("Результат римского выражения должен быть положительным");
        }

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int remaining = number;
        for (int i = 0; i < values.length; i++) {
            while (remaining >= values[i]) {
                remaining -= values[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }
}
