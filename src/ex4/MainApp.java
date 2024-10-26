package ex4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();

        int randNumber1 = random.nextInt(1,30);
        int randNumber2 = random.nextInt(1,30);
        System.out.println("First random number = " + randNumber1);
        System.out.println("Second random number = " + randNumber2);

        int i, j, save = 0;
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();

        for (i = 1; i <= randNumber1; i++){
            if((randNumber1 % i) == 0){
                number1.add(i);
            }
        }

        for (i = 1; i <= randNumber2; i++){
            if((randNumber2 % i) == 0){
                number2.add(i);
            }
        }

        System.out.println(number1);
        System.out.println(number2);

        for(i = 0; i < number1.size(); i++){
            for(j = 0; j < number2.size(); j++){
                if(Objects.equals(number1.get(i), number2.get(j))){
                    save = number2.get(j);
                }
            }
        }

        System.out.println(save);
    }
}
