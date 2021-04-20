/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.potassio;

import com.solos.arquitetura.analise.Resultado;

public class CorrecaoPotassio{
    private double participacaoCTCDesejada;
    private FontesPotassio fonteAUtilizar;
    private Resultado resultado;
    
    public CorrecaoPotassio(double participacaoCTCDesejada, FontesPotassio fonteAUsar, Resultado resultado){
        this.participacaoCTCDesejada = participacaoCTCDesejada;
        this.fonteAUtilizar = fonteAUsar;
        this.resultado = resultado;
    }

    public double participacaoPotassioCTCAtual() {
        return this.resultado.getPotassio()/(this.resultado.getCalcio()+this.resultado.getMagnesio()+this.resultado.getPotassio()+this.resultado.getHidrogenioAluminio())*100;
    }
    
    double participacaoPotassioAposCorrecao() {
        if(this.participacaoCTCDesejada> 0.001){
            return this.participacaoCTCDesejada;
        }
        else{
            return 0.0;
        }
    }
    
    double participacaoIdealPotassioCTC() {
        return 3;
    }
    
    public double quantidadeParaAplicar() {
        return (this.resultado.getPotassio()*this.participacaoCTCDesejada/this.participacaoPotassioCTCAtual()) - this.resultado.getPotassio()*391*2*1.2*100/0.85/this.fonteAUtilizar.getValorFontePotassio();
    }
    
    public String campoCorrecaoPotassio(){
        return this.quantidadeParaAplicar()*this.fonteAUtilizar.getCampoCorrecaoUm()+ " - " + this.fonteAUtilizar.getCampoCorrecaoDois() + " - " + quantidadeParaAplicar()* this.fonteAUtilizar.getCampoCorrecaoTres() + " - "+this.fonteAUtilizar.getCampoCorrecaoQuatro();
    }
    
    double custo() {
        return this.fonteAUtilizar.getValorFontePotassio()*this.quantidadeParaAplicar()/1000;
    }

}
