import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int totalSpending = 0;
        for (int i = 0; i < 30; i++) {
            totalSpending += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSpending + " рублей");
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int i = 0; i < 30; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int totalSpending = 0;
        for (int i = 0; i < 30; i++) {
            totalSpending += arr[i];
        }
        double averageSpending = totalSpending / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}