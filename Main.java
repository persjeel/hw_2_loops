public class Main {
    private static void showSomeNumberOfOddNaturalDigit(int[] arr, int num_of_odd_elem_toshow) {
        if (arr != null) {
            for (int i = 0; i < arr.length && i <= num_of_odd_elem_toshow; i++) {
                if (arr[i] % 2 != 0) System.out.print(arr[i] + "; ");
            }
            System.out.println();
        }
    }

    private static int GetSumOfSomeNumberOfOddNaturalDigit(int[] arr, int num_of_odd_elem_tosum) {
        int sum = 0;
        if (arr == null) return 0;
        for (int i = 0; i < arr.length && i <= num_of_odd_elem_tosum; i++) {
            if (arr[i] % 2 != 0) sum += arr[i];
        }
        return sum;
    }

    private static boolean IsPrimeNumber(int num) {
        if (num == 1) return false;
        for (int delim = 2; delim < num; delim++) {
            if (num % delim == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //task 1
        /*Напишіть програму на Java для відображення n членів непарного натурального числа та їх суми.
         (Наприклад, якщо вибрати число 7, на екрані має бути перших 7 непарних чисел 1,3,5,7,9, 11, 13 і їх сума 49).
         n обрати самостійно, для тих хто вміє, можна використати Scanner.*/
        int[] arr = {1, 2, 3, 5, 7, 11, 12, 13, 14, 15, 17, 20, 22, 23};
        showSomeNumberOfOddNaturalDigit(arr, 5);
        int sum_ofodd_digit = GetSumOfSomeNumberOfOddNaturalDigit(arr, 5);
        System.out.println("Sum of 5 odd digit: " + sum_ofodd_digit);

        //task 2
        //Напишіть програму на Java для відображення всіх кратних 3 в діапазоні від 10 до 50.
        System.out.println("List of digits from 10 to 50 that are divided by 3:");
        for (int num = 10; num <= 50; num++) {
            if (num % 3 == 0) {
                System.out.print(num + "; ");
            }
        }
        System.out.println();

        //task 3
        //Напишіть програму для перевірки, чи є дане ціле число простим чи ні
        System.out.println("Prime digits:");
        for (int i = 0; i < 60; i++) {
            if (IsPrimeNumber(i)) System.out.print(i + "; ");
        }
        System.out.println();

    }
}