public class Main {
    private static int[] Get_Arr_of_FibonacciNums(int amount_of_fibonac_num) {
        int[] fibonacci_arr = new int[amount_of_fibonac_num];
        fibonacci_arr[0] = 1;
        fibonacci_arr[1] = 1;
        for (int i = 2; i < amount_of_fibonac_num; i++) {
            fibonacci_arr[i] = fibonacci_arr[i - 1] + fibonacci_arr[i - 2];
        }
        return fibonacci_arr;
    }

    public static double Get_Medium_Value(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        sum /= arr.length;
        return sum;
    }

    public static void main(String[] args) {
        int[] fib_arr = Get_Arr_of_FibonacciNums(20);
        double medium_val = Get_Medium_Value(fib_arr);
    }


}