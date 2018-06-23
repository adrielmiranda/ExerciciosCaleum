/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaporta;

import java.util.Scanner;

/**
 *
 * @author CLIENTE
 */
public class Main {

    public static void main(String[] args) {
        int segundos;
        int qtdeHoras = 0;
        int qtdeMinutos = 0;
        int qtdeSegundos;

        Scanner ler = new Scanner(System.in);
        segundos = ler.nextInt();

        if (segundos >= (segundos / (60 * 60))) {
            qtdeHoras = segundos / (60 * 60);
        }
        if (qtdeHoras == 0) {
            if (segundos >= segundos / 60) {
                qtdeMinutos = segundos / 60;
            }
        } 
        else {
            qtdeMinutos = (segundos - (qtdeHoras * (60 * 60))) / 60;
        }
        if (qtdeMinutos == 0) {
            qtdeSegundos = segundos;
        } 
        else {
            qtdeSegundos = segundos - ((qtdeHoras * (60 * 60)) + (qtdeMinutos * 60));
        }

        System.out.printf("%d:%d:%d%n%n ", qtdeHoras, qtdeMinutos, qtdeSegundos);

        ler.close();

    }
}
