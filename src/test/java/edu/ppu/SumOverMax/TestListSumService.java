package edu.ppu.SumOverMax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestListSumService {


    ListSumService tester = new ListSumService();

    @Test
    public void test_getSum() {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        assertEquals(3, tester.getSum(list));
//as
    }

    @Test
    public void test_emptyAL() {
        ArrayList<Integer> list=new ArrayList<Integer>();

        assertEquals(0, tester.getSum(list));

    }


}
