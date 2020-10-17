package edu.ppu.SumOverMax;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestListSumService {


    ListSumService tester = new ListSumService();

    public void test_getSum() {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        assertEquals(3, tester.getsum(list));

    }

    public void test_emptyAL() {
        ArrayList<Integer> list=new ArrayList<Integer>();

        assertEquals(-1, tester.getsum(list));

    }


}
