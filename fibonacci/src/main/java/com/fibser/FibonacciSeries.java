package com.fibser;



public class FibonacciSeries 
{
   
    public long[] find(int number)
    {
       long arr[] = new long[number];
       int first = 0 ,second = 1;

       for (int i = 0; i < number ; i++){
           if (i == 0){
               arr[i] = first;
           }
           else if (i ==1){
                arr[i] = second;
           }
           else{
                arr[i] = arr[i-1] + arr[i-2];
           }
       }
        return arr;
    
   }
}
