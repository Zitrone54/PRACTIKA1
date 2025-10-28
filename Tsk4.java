package z4;

        import java.util.Scanner; // Импортируем класс Scanner для чтения с клавиатуры

public class Tsk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект для ввода

        // Спрашиваем у пользователя, сколько чисел он хочет ввести
        System.out.print("Сколько чисел вы хотите ввести? ");
        int n = scanner.nextInt(); // Читаем количество

        // Создаём массив нужного размера
        int[] numbers = new int[n];

        // Вводим числа в массив
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // =========== Сумма с помощью цикла while ===========
        int sumWhile = 0;
        int i = 0; // счётчик
        while (i < numbers.length) {
            sumWhile += numbers[i]; // то же, что sumWhile = sumWhile + numbers[i]
            i++; // увеличиваем счётчик
        }

        // =========== Сумма с помощью цикла do-while ===========
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += numbers[j];
            j++;
        } while (j < numbers.length); // Условие проверяется ПОСЛЕ выполнения тела

        // =========== Поиск минимума и максимума ===========
        // Предполагаем, что первый элемент — и минимум, и максимум
        int min = numbers[0];
        int max = numbers[0];
        int k = 1; // начинаем со второго элемента
        while (k < numbers.length) {
            if (numbers[k] < min) {
                min = numbers[k]; // нашли меньшее — обновляем min
            }
            if (numbers[k] > max) {
                max = numbers[k]; // нашли большее — обновляем max
            }
            k++;
        }

        // =========== Вывод результатов ===========
        System.out.println("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do-while): " + sumDoWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        scanner.close(); // Закрываем сканер (хороший тон)
    }
}