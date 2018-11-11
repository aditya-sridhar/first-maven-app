package com.first.app;

import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        printVals(items);
        System.out.println("Sum: "+getSum(items));
    }

    public static void printVals(List<Integer> items){
        items.forEach( item ->{
            System.out.println(item);
        });
    }

    public static int getSum(List<Integer> items){
        int sum = 0;
        for(int item:items){
            sum += item;
        }
        return sum;
    }
}
