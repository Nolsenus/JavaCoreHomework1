/**
 * Класс Decorator используется для преобразования данных в готовый для вывода вид.
 */

public class Decorator {

    /**
     * Преобразовывает имя и возраст в готовое приветствие.
     * @param name имя приветствуемого
     * @param age возраст приветствуемого
     * @return готовое приветствие
     */

    public static String helloUser(String name, int age) {
        return String.format("Здравствуйте, %s! Ваш возраст: %d", name, age);
    }
}
