/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author PC
 */
public class Calculos {

    int somar(int a, int b) {
        return Math.abs(a)+Math.abs(b);
    }

    int dividir(int a, int b) {
        if (b==0){
            return -1;
        } else {
            return a/b;
        }
    }

    int multiplicar(int a, int b) {
        if (a<0 || b<0){
            return -1;
        } else {
            return a*b;
        }
    }

    int subtrair(int a, int b) {
        return Math.abs(a)-Math.abs(b);
    }
    
}
