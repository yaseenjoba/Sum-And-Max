package edu.ppu.SumOverMax;
import org.junit.Test;

import org.junit.Assert;


import java.util.ArrayList;

public class TestListMaxService {
    @Test
    public void test1(){
        ListMaxService listMaxService=new ListMaxService();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<10;i++){
            arr.add(0);
        }
        Assert.assertEquals(0,listMaxService.getMax(arr));
    }
    @Test
    public void test2() {
        ListMaxService listMaxService=new ListMaxService();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<10;i++){
            arr.add(i);
        }
        Assert.assertEquals(0,listMaxService.getMax(arr));

    }

    @Test
    public void test3(){
        ListMaxService listMaxService=new ListMaxService();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<10;i++){
            arr.add(-1*i);
        }
        Assert.assertEquals(0,listMaxService.getMax(arr));

    }

    @Test (expected = NullPointerException.class)
    public void test4(){
        ListMaxService listMaxService=new ListMaxService();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max= listMaxService.getMax(arr);
    }

}
