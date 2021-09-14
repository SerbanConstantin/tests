package tests.ex0.testari;

import java.util.Arrays;

public class Class {

    public static void main(String[] args) {

        int[] result = {1,2,3,2,3,4,3,1,3,4,};

        System.out.println(Arrays.toString(result));

        int count = 0;
        for (int i = 0; i < result.length; i++){
            if (result[i] == 4){
                count++;
                result[i] = 7;
            }
        }
        System.out.println(Arrays.toString(result));


    }




}
