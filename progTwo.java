package HW.Java_hw3;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

public class progTwo {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(0, 10));
            
        }
        System.out.println(arr.toString());
        int max = arr.get(0);
        int min = arr.get(0);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) max = arr.get(i);
            if (arr.get(i) < min) min = arr.get(i);
            sum = sum + arr.get(i);
            
            
        }
        System.out.printf("min: %d\n", min);
        System.out.printf("max: %d\n", max);
        System.out.printf("midel %.1f\n", ((float)sum/arr.size()));
        
    }
    
}
