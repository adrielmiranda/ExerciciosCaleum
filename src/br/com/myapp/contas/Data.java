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
public class Data {
    
    int dia;
    int mes;
    int ano;
    
    String dataformatada(){
        String dados = this.dia + "/" + this.mes + "/" + this.ano;
        return dados;
    }
}
