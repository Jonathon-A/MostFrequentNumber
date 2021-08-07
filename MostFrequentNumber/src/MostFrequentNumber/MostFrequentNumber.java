package MostFrequentNumber;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class MostFrequentNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many would numeric digits you like to enter");
        int Loop = input.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < Loop; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            nums.add(input.nextInt());
        }

        Collections.sort(nums);

        int bufferValue = 0;
        int bufferNum = 0;

        int Value = 0;
        int Num = 0;

        boolean multimodal = false;

        for (int i = 0; i < Loop; i++) {

            if (bufferNum == nums.get(i)) {
                bufferValue++;
            } else {
                bufferNum = nums.get(i);
                bufferValue = 1;
            }

            if (bufferValue == Value) {
                multimodal = true;
            }
            if (bufferValue > Value) {
                multimodal = false;
                Value = bufferValue;
                Num = bufferNum;
            }
        }

        if (multimodal) {
            System.out.println("Data was multimodal");
        } else {

            System.out.println("Most frequently entered digit was " + Num + " and that digit was entered " + Value + " times.");
        }
    }

}
