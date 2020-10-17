package edu.ppu.SumOverMax;

import java.util.ArrayList;

public class ListSumService {
    public int getsum(ArrayList<Integer> arr) {
        int sum = 0;
        if (arr.size() > 0) {


            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
            }
            return sum;
        } else return -1;
    }
}
