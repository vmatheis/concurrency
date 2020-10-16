/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author vmatheis
 */
public class MyThread implements Callable<Integer> {

    int untergrenze;
    int result = 0;
    List<Integer> list = new ArrayList<>();

    public MyThread(List<Integer> list, int untergrenze) {

        this.list = list;
        this.untergrenze = untergrenze;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }

}
