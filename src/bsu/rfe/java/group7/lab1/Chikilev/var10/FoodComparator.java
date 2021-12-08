package bsu.rfe.java.group7.lab1.Chikilev.var10;

import java.util.Comparator;


public class FoodComparator implements Comparator<Food> {
    public int compare(Food arg0,Food arg1) {
        if(arg0 == null) return 1;
        if(arg1 == null) return -1;
        return arg1.lenght() - arg0.lenght();
    }
}

