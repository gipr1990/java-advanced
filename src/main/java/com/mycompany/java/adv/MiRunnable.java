/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.adv;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EducaciónIT
 */
public class MiRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
