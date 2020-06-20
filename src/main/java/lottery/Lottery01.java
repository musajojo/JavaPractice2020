package lottery;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lottery01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int [] numberPicker = new int[3];
        numberPicker[0] = 5;
        numberPicker[1] = 3;
        numberPicker[2] = 8;

        int [] lotteryNumber = new int[3];
        lotteryNumber[0] = 8;
        lotteryNumber[1] = 3;
        lotteryNumber[2] = 6;

        System.out.println(Arrays.equals(numberPicker,lotteryNumber));

        System.out.println("Contents of numberPicker: ");
        for(int i=0; i<numberPicker.length; i++) {
            System.out.println(numberPicker[i]);
        }

        System.out.println("Contents of lotteryNumber: ");
        for(int i=0; i<lotteryNumber.length; i++) {
            System.out.println(lotteryNumber[i]);
        }
        System.out.println();

        System.out.println("Lottery Results: ");
        for(int i=0; i<(numberPicker.length); i++) {
//            System.out.println(numberPicker[i]);
            for(int j=0; j<lotteryNumber.length; j++) {
//                System.out.println(lotteryNumber[j]);

                if (numberPicker[i] == lotteryNumber[j]) {
                    System.out.println(numberPicker[i] + " and " + lotteryNumber[j] + " are a match");
                } else {
//                    System.out.println(numberPicker[i] + " and " + lotteryNumber[j] + " are not a match");
                }

            }

        }




    }

}
