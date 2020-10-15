/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconcurrency;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author vmatheis
 */
public class MyRunnable implements Runnable {

    private List<Integer> list;
    private int devider;

    public MyRunnable(List<Integer> list, int teiler) {
        this.list = list;
        this.devider = teiler;
    }

    public void run() {
        list = list.stream()
                .filter(s -> s % devider == 0)
                .collect(Collectors.toList());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}
