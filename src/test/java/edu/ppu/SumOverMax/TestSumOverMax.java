package edu.ppu.SumOverMax;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSumOverMax {
    @Test
    public void Test1(){
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(50);
        arr.add(100);
        arr.add(50);
        SumOverMax sumOverMax = new SumOverMax();
        Assert.assertEquals(2,sumOverMax.getSumOverMax(arr));
    }
}
