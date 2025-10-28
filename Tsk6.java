package z6;

public class Tsk6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        // Цикл от 1 до 10 (включительно)
        for (int i = 1; i <= 10; i++) {
            // Считаем 1 / i как число с плавающей точкой
            double term = 1.0 / i; // 1.0 — чтобы результат был double, а не целым

            // Форматируем вывод: номер, дробь и значение с 6 знаками после запятой
            System.out.printf("1/%d = %.6f%n", i, term);
        }
    }
}