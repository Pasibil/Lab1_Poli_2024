package ex5;

import java.util.ArrayList;
import java.util.Random;

public class MainApp {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static ArrayList<Integer> fibonacciVector(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev1 = 0, prev2 = 1;
        list.add(prev1);
        list.add(prev2);
        for (int i = 1; i < n; i++) {
            int next = prev1 + prev2;
            list.add(next);
            prev1 = prev2;
            prev2 = next;
        }
        return list;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 9;
        System.out.println("Al " + n + "-lea număr Fibonacci este: " + fibonacci(n));

        ArrayList<Integer> list = fibonacciVector(n);
        System.out.println(list);

        int randNumber = random.nextInt(0,20);
        System.out.println("Random number = " + randNumber);
        for(int number: list){
            if(number == randNumber){
                System.out.println("Numarul [" + randNumber + "] apartine sirului lui Fobonacci");
            }
        }
    }
}
