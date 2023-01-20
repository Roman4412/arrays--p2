import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();

    }


    // generateRandomArray
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("///// Task 1 /////");
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int expens : expenses) {
            sum = sum + expens;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("///// Task 2 /////");
        int[] expenses = generateRandomArray();
        Arrays.sort(expenses);
        int minExpense = Integer.MAX_VALUE;
        int maxExpense = Integer.MIN_VALUE;
        for (int expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
            if (expens < minExpense) {
                minExpense = expens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + maxExpense + " рублей");
    }
    public static void task3() {
        System.out.println("///// Task 3 /////");
        int[] expenses = generateRandomArray();
        int tmp = 0;
        for (int expens : expenses) {
            tmp += expens;
        }
        double averageExpense = (double) tmp / expenses.length;
        System.out.println(averageExpense);
        // String formattedBalance = new DecimalFormat("#0.00").format(balance);
    }
    public static void task4() {
        System.out.println("///// Task 4 /////");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}