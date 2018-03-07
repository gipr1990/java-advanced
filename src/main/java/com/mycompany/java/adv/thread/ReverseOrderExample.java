/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.adv.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EducaciónIT
 */
public class ReverseOrderExample {

    public static void main(String[] args) throws InterruptedException {
            ReverseRunnable primerHijo = new ReverseRunnable(1);
            Thread t = new Thread(primerHijo);
            t.start();
    }
    
    
    static class ReverseRunnable implements Runnable {
        
        int numero;

        public ReverseRunnable(int numero) {
            this.numero = numero;
        }

        @Override
        public void run() {           
            if (numero != 5) {
                try {
                    ReverseRunnable otroHilo = new ReverseRunnable(numero+1);
                    Thread t = new Thread(otroHilo);
                    t.start();
                    t.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReverseOrderExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Hola hilo "+numero);
        }
        
    }
    
}


