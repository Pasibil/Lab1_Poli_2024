package ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce-ti numarul: ");
        int num = scanner.nextInt();

        short count = 0;
        for (int i = 1; i <= num; i++){
            if((num % i) == 0){
                System.out.println(i);
                count++;
                Thread.sleep(200);
            }
        }
        if(count != 1 && count != 2){
            System.out.println("Numarul " + num + " are " + count + " divizori");
        }
        else if(count == 1){
            System.out.println("Numarul " + num + " are " + count + " divizor");
        }
        else{
            System.out.println("Numarul este prim");
        }

    }
}
