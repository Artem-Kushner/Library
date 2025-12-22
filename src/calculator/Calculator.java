package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String input;
        int number1;
        int number2;
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вас приветствует консольный калькулятор!");
        while (true) {
            System.out.println();
            System.out.print("Введите число (или 'QUIT' для выхода): ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()){
                System.out.println("Ошибка ввода!");
                return;
            }
            if (input.equalsIgnoreCase("QUIT")){
                System.out.println("Калькулятор завершил работу.");
                break;
            }
            number1 = Integer.parseInt(input);
            System.out.println("Выберите оператор: +, -, *, /");

            operator = scanner.nextLine();
            System.out.println("Введите число: ");
            number2 = scanner.nextInt();
            switch (operator) {
                case "+":
                    System.out.println("Ответ: " + (number1 + number2));
                    break;
                case "-":
                    System.out.println("Ответ: " + (number1 - number2));
                    break;
                case "*":
                    System.out.println("Ответ: " + (number1 * number2));
                    break;
                case "/":
                    if(number2 !=0) {
                        System.out.println("Ответ: " + (number1 / number2));
                    }
                    else {
                        System.out.println("Деление на ноль невозможно!");
                    }
                    break;
                default:
                    System.out.println("Оператор введен не верно попробуйте еще раз!");
            }

        }
    }
}
