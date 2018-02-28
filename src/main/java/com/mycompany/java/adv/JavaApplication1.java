/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.adv;

/**
 *
 * @author EducaciónIT
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable r1=() -> {
            for (int i=100; i < 200; i++) {
                System.out.println(i);
            }
        };
        
        Runnable r2 = new MiRunnable();
               
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        
  
            
    }
    
}
