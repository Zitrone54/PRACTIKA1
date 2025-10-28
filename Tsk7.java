package z7;

        import java.util.Scanner;

public class Tsk7 {
    // Метод для вычисления факториала
    // public — можно вызывать из других классов
    // static — можно вызывать без создания объекта
    // long — факториал быстро растёт, int не хватит даже для 13!
    public static long factorial(int n) {
        if (n < 0) {
            // Факториал отрицательного числа не определён
            return -1; // или можно бросить исключение, но пока просто -1
        }

        long result = 1; // Начальное значение

        // Цикл от 1 до n (включительно)
        for (int i = 1; i <= n; i++) {
            result = result * i; // Умножаем на текущее число
        }

        return result; // Возвращаем результат
    }

    // Главный метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        long fact = factorial(number); // Вызываем наш метод

        if (fact == -1) {
            System.out.println("Факториал не определён для отрицательных чисел.");
        } else {
            System.out.println(number + "! = " + fact);
        }

        scanner.close();
    }
}