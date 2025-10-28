package z32;

public class Tsk3 {
    public static void main(String[] args) {
        // Создаём массив целых чисел с помощью инициализации (как в Си)
        int[] numbers = {10, 20, 30, 40, 50};

        // Переменная для хранения суммы элементов
        int sum = 0;

        // Цикл for: проходим по всем элементам массива
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // То же самое, что sum = sum + numbers[i]
        }

        // Вычисляем среднее арифметическое
        // Приводим sum к double, чтобы получить дробный результат
        double average = (double) sum / numbers.length;

        // Выводим массив
        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Перевод строки

        // Выводим результаты
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}