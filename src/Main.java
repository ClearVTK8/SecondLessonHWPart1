import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите номер задания от 1 до 5: ");
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.print("Напишите номер месяца (1-12): ");
                int month_number = sc.nextInt();
                switch (month_number) {
                    case 12, 1, 2 -> System.out.print("Зима");
                    case 3, 4, 5 -> System.out.print("Весна");
                    case 6, 7, 8 -> System.out.print("Лето");
                    case 9, 10, 11 -> System.out.print("Лето");
                    default -> System.out.print("Вы ввели неправильный номер");
                }
                break;
            }

            case 2: {
                System.out.print("Напишите номер месяца (1-12): ");
                int month_number2 = sc.nextInt();
                if (month_number2 == 12 | month_number2 == 1 | month_number2 == 2) {
                    System.out.print("Зима");
                } else if (month_number2 == 3 | month_number2 == 4 | month_number2 == 5) {
                    System.out.print("Весна");
                } else if (month_number2 == 6 | month_number2 == 7 | month_number2 == 8) {
                    System.out.print("Лето");
                } else if (month_number2 == 9 | month_number2 == 10 | month_number2 == 11) {
                    System.out.print("Осень");
                } else System.out.print("Вы ввели неправильный номер");
                break;
            }

            case 3: {
                System.out.print("Введите любое число: ");
                int number3 = sc.nextInt();
                if (number3 % 2 == 1)
                    System.out.print("Число нечётное");
                else System.out.print("Число чётное");
                break;
            }

            case 4: {
                System.out.print("Введите температуру на улице (t): ");
                int temp = sc.nextInt();
                if (temp > -5) {
                    System.out.print("Тепло");
                } else if ((-5 <= temp) | (temp > -20)) {
                    System.out.print("Нормально");
                } else
                    System.out.print("Холодно");
                break;
            }

            case 5: {
                System.out.print("Введите номер от 1 до 7 для определения цвета радуги: ");
                int color = sc.nextInt();
                switch (color) {
                    case 1 -> System.out.print("Красный");
                    case 2 -> System.out.print("Оранжевый");
                    case 3 -> System.out.print("Жёлтый");
                    case 4 -> System.out.print("Зелёный");
                    case 5 -> System.out.print("Берюзовый");
                    case 6 -> System.out.print("Синий");
                    case 7 -> System.out.print("Фиолетовый");
                }
                break;
            }
        }


    }
}