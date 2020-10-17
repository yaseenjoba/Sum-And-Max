package edu.ppu.SumOverMax;

import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.List;

public class ListMaxService {
    public int getMax(ArrayList<Integer>arr){
        if(arr.isEmpty())
            throw new NullPointerException();
        int max= Integer.MIN_VALUE;
        for (int i = 0; i<arr.size(); i++){
            if(arr.indexOf(i)>max)
                max=arr.indexOf(i);
        }
        return max;
    }
}
