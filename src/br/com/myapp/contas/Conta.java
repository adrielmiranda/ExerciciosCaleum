/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.myapp.contas;

/**
 *
 * @author CLIENTE
 */

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;
    private static int totalDeContas;
    
    public Conta(){
        
    }
    
    public Conta(String titular){
        this.titular = titular;    
    }
    
    public String testeJava(){
    	return "teste";
    }
    
    public int getTotaldeContas(){
        return Conta.totalDeContas;
        
    }
    
    public void saca(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Não pode sacar um valor maior do que o da conta");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    
    public void alterarNome(){
        this.setTitular("Mestre." + this.getTitular());
    }

    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    double calculaRendimento() {
        this.setSaldo(this.getSaldo() * 0.1);
        return this.getSaldo();
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.getTitular();
        dados += "\nNumero: " + this.getNumero();
        dados += "\nAgencia: " + this.getAgencia();
        //dados += "\nData da Abertura: " + this.getDataAbertura().dataformatada();
        dados += "\nSaldo: " + this.getSaldo();
        dados += "\nRendimento mensal: " + calculaRendimento();
        return dados;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

}
