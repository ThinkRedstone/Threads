/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q;

/**
 *
 * @author Sharon
 */
public class Q2 implements Runnable {

    public Q2(int num) {
        this.num = num;
    }
    int num;

    @Override
    public void run() {

        System.out.println("Q2:" + (num % 10 + num / 10));

    }

}
