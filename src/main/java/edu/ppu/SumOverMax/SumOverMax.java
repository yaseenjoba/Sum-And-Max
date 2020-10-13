package edu.ppu.SumOverMax;

import java.util.ArrayList;

public class SumOverMax {
    public int getSumOverMax(ArrayList<Integer>arr)
    {
        ListMaxService listMaxService = new ListMaxService();
        ListSumService listSumService = new ListSumService();
        int sum = listSumService.getSum(arr);
        int max = listMaxService.getMax(arr);
        return sum/max;
    }
}
