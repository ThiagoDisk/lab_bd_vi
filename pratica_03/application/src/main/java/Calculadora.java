/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Calculadora {

    //Este metodo ira realizar o calculo do arranjo.
    public static int fatorialN(int n) {
        int resultadoN = 1;
        if (n > 0){
            while( n > 0) {
                resultadoN = resultadoN * n;
                n--;
            }
            return resultadoN;
        }else{
            return 0;
        }
    }

    public static int fatorialNP(int n ,int p) {
        int resultadoNP = 1;
        int np = (n-p);
        if(n > 0 && p > 0){
            while( np > 0) {
                resultadoNP = resultadoNP * np;
                np--;
            }
            return resultadoNP;
        }else{
            return 0;
        }
    }


    public static int arranjo (int n, int p ) {
        if(n > 0 && p > 0){
            return fatorialN(n)/fatorialNP(n,p);
        }else{
            return 0;
        }
    }
}