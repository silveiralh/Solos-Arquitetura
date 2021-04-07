/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.potassio;

import com.solos.arquitetura.analise.Resultado;

/**
 *
 * @author Rique
 */
public class CorrecaoPotassio{
    private double participacaoCTCDesejada;
    private FontesPotassio fonteAUsar;
    private Resultado resultado;
    
    public CorrecaoPotassio(double participacaoCTCDesejada, FontesPotassio fonteAUsar, Resultado resultado){
        this.participacaoCTCDesejada = participacaoCTCDesejada;
        this.fonteAUsar = fonteAUsar;
        this.resultado = resultado;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">

    public double getparticipacaoCTCDesejada() {
        return participacaoCTCDesejada;
    }

    public void setparticipacaoCTCDesejada(double participacaoCTCDesejada) {
        this.participacaoCTCDesejada = participacaoCTCDesejada;
    }

    public FontesPotassio getfonteAUsar() {
        return fonteAUsar;
    }

    public void setfonteAUsar(FontesPotassio fonteAUsar) {
        this.fonteAUsar = fonteAUsar;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Metodos correção potássio  ">
    
    public double participacaoPotassioCTCAtual() {
        return this.resultado.getPotassio()/(this.resultado.getCalcio()+this.resultado.getMagnesio()+this.resultado.getPotassio()+this.resultado.gethidrogenioAluminio())*100;
    }
    
    public int valorFontePotassio() {
        switch(this.fonteAUsar){
            case CLORETO_DE_POTASSIO:
                return 58;
            case SULFATO_DE_POTASSIO:
                return 52;
            case SULFATO_POTASSIO_MAGNESIO:
                return 22;
            default:
                return 0;
        }
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
    
    public double quantidadeAplicar() {
        return (this.resultado.getPotassio()*this.participacaoCTCDesejada/this.participacaoPotassioCTCAtual()) - this.resultado.getPotassio()*391*2*1.2*100/0.85/valorFontePotassio();
    }
    
    public String campoCorrecaoPotassio(){
        switch(this.fonteAUsar){
            case CLORETO_DE_POTASSIO:
                return "";
            case SULFATO_DE_POTASSIO:
                return this.quantidadeAplicar()*0.17 + "- Enxofre";
            case SULFATO_POTASSIO_MAGNESIO:
                return this.quantidadeAplicar()*0.22 + "- Enxofre - " + this.quantidadeAplicar()*0.18+ "- Magnésio";
            default:
                return "";
        }
    }
    
    double custo() {
        return valorFontePotassio()*this.quantidadeAplicar()/1000;
    }
    
    //</editor-fold>
    
}
