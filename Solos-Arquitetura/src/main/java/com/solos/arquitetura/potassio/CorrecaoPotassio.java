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
public class CorrecaoPotassio {
    private double participacao_CTC_desejada;
    private int fonteAUsar;
    private Resultado resultado;
    
    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">

    public double getParticipacao_CTC_desejada() {
        return participacao_CTC_desejada;
    }

    public void setParticipacao_CTC_desejada(double participacao_CTC_desejada) {
        this.participacao_CTC_desejada = participacao_CTC_desejada;
    }

    public double getfonteAUsar() {
        return fonteAUsar;
    }

    public void setfonteAUsar(int fonteAUsar) {
        this.fonteAUsar = fonteAUsar;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Metodos correção potássio  ">
    public String fontePotassioAUsar() {
        switch (this.fonteAUsar) {
            case (1):
                return "Cloreto de Potassio";
            case (2):
                return "Sulfato de Potassio";
            case (3):
                return "Sulfato Potassio Magnesio";
            default:
                return "";
        }
    }
    
    public double participacaoPotassioCTCAtual() {
        return this.resultado.getPotassio()/(this.resultado.getCalcio()+this.resultado.getMagnesio()+this.resultado.getPotassio()+this.resultado.gethidrogenioAluminio())*100;
    }
    
    public int fontePotassio() {
        switch(this.fonteAUsar){
            case (1):
                return 58;
            case (2):
                return 52;
            case (3):
                return 22;
            default:
                return 0;
        }
    }
    
    public double quantidadeAplicar() {
        return (this.resultado.getPotassio()*this.participacao_CTC_desejada/this.participacaoPotassioCTCAtual()) - this.resultado.getPotassio()*391*2*1.2*100/0.85/fontePotassio();
    }
    
    //</editor-fold>
    
}
