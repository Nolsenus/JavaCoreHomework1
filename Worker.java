import java.util.Scanner;

/**
 * Основной рабочий класс программы.
 */

public class Worker {

    /**
     * Поле scanner используется для получения данных от пользователя.
     */

    private final Scanner scanner;

    /**
     * При создании класса можно передать Scanner, который будете использовать для получения данных от пользователя.
     * @param scanner ваш Scanner
     */

    public Worker(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Конструктор без параметров будет использовать Scanner по System.in.
     */

    public Worker() {
        scanner = new Scanner(System.in);
    }

    /**
     * Метод setData выводит в консоль приглашение для ввода данных и возвращает следующую полученную строку.
     * @param prompt текст приглашения
     * @return следующая полученная строка
     */

    public String setData(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Метод run выступает в роли основного рабочего тела программы.
     * В этом методе мы получаем от пользователя имя и возраст, и выводим приветствие на основании полученных данных.
     *
     */

    public void run() {
        String name = setData("Введите имя: ");
        int age;
        try {
            age = Integer.parseInt(setData("Введите возраст: "));
        } catch (NumberFormatException e) {
            age = -1;
            e.printStackTrace();
        }
        System.out.println(Decorator.helloUser(name, age));
        scanner.close();
    }
}
