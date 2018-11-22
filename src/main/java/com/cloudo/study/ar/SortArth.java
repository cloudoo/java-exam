package com.cloudo.study.ar;

import java.util.Arrays;

public class SortArth {

    public void bubble(int[] temp){


        int t = 0;

        for(int i=0;i<temp.length-1;i++){

            for(int j=0;j<temp.length-i-1;j++){
                if(temp[j]>temp[j+1]){
                    t = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] =t;
                }
            }

        }
    }

    public static void main(String[] args) {

        SortArth sortArth = new SortArth();
        int[] a = new int[]{13,4,25,657,1,34,57,2,15,3,5,0,88,6};
        System.out.println("排序前："+ Arrays.toString(a));

//        int[] b = { 3, 1, 4, 7, 2, 1, 9, 5, 10, 6, 8, 2 };
        sortArth.bubble(a);
        System.out.println("排序后："+ Arrays.toString(a));


    }
}
