package com.mycompany.exercicioforfibonacci;

public class ExercicioForfibonacci {

    public static void main(String[] args) {

        int n = 10;
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.println("Os primeiros " + n + " números da "
        + "sêquencia de Fibonacci são:");
        System.out.println(primeiroTermo + " " + segundoTermo + " ");
        
        for (int i = 3; i<=n; i++){
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(proximoTermo + " ");
            
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            
        }



    }
}
