/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaporta;

/**
 *
 * @author CLIENTE
 */
public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    
    
    String pintarCasa(String cor){
        this.cor = cor;
        return this.cor;
    }
    
    
    int quantasPortasEstaoAbertas(){
        int contePortas = 0;
        if(this.porta1 == true){
            contePortas++;
        }
        if(this.porta2 == true){
            contePortas++;
        }
        if(this.porta3 == true){
            contePortas++;
        }
        return contePortas;
    }
    
    boolean abrePorta(boolean porta){
        if(porta == this.porta1){
            this.porta1 = true;
            return true;
        }
        else if(porta == this.porta2){
            this.porta2 = true;
            return true;
        }
        else{
            this.porta3 = true;
            return true;
        }
    }
    
    boolean fechaPorta(boolean porta){
        if(porta == this.porta1){
            this.porta1 = false;
            return false;
        }
        else if(porta == this.porta2){
            this.porta2 = false;
            return false;
        }
        else{
            this.porta3 = false;
            return false;
        }
    }
    
    String obtenhaDadosParaImpressao(){
        String dados = "Cor da casa: " + this.cor;
        dados += "\nPorta1: " + this.porta1;
        dados += "\nPorta2: " + this.porta2;
        dados += "\nPorta3: " + this.porta3;
        dados += "\nQtde de portas abertas: " + quantasPortasEstaoAbertas();
        return dados;
    }
}
