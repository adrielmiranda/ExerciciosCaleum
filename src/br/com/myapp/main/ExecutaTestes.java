/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myapp.main;
import br.com.myapp.contas.Conta;

/**
 *
 * @author CLIENTE
 */
public class ExecutaTestes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta contaAdriel = new Conta();
        contaAdriel.setTitular("Adriel Miranda");
        contaAdriel.setAgencia("Agencia");
        contaAdriel.setNumero(456);
        
        contaAdriel.alterarNome();
        contaAdriel.deposita(1500);
        contaAdriel.deposita(500);
        contaAdriel.saca(200);
        contaAdriel.deposita(2);
        
        
        System.out.println(contaAdriel.recuperaDadosParaImpressao());
    }
    
}
