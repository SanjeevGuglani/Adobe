package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class Equilibrium {
    public static int equi(int arr[]){
        int i=1,j=arr.length-2;
        int firstSum=arr[0];
        int lastSum = arr[arr.length-1];
        while(i<=j){
              if(firstSum==lastSum){
                  return i;
              }
                firstSum = firstSum+arr[i];
                i++;
                lastSum = lastSum+arr[j];
                j--;

        }
        return -1;

    }

    public static void main(String[] args) {
            int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(equi(arr));
        int arr1[] = { 1,3,5,2,2 };
        System.out.println(equi(arr1));
    }
}
