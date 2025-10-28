package z5;

public class Tsk5 {
    public static void main(String[] args) {
        // args — это массив строк, переданных при запуске программы
        // Например: java Task5 привет мир 123 → args = {"привет", "мир", "123"}

        System.out.println("Аргументы командной строки:");

        // Цикл for: проходим по всем элементам массива args
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }

        // Если аргументов нет, сообщим об этом
        if (args.length == 0) {
            System.out.println("Аргументы не переданы.");
        }
    }
}