/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.potassioo;

import com.solos.arquitetura.analise.Resultado;

/**
 *
 * @author Rique
 */
public class CorrecaoPotassio {
    private double participacao_CTC_desejada;
    private int fonte_a_usar;
    private Resultado resultado;
    
    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">

    public double getParticipacao_CTC_desejada() {
        return participacao_CTC_desejada;
    }

    public void setParticipacao_CTC_desejada(double participacao_CTC_desejada) {
        this.participacao_CTC_desejada = participacao_CTC_desejada;
    }

    public double getFonte_a_usar() {
        return fonte_a_usar;
    }

    public void setFonte_a_usar(int fonte_a_usar) {
        this.fonte_a_usar = fonte_a_usar;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Metodos correção potássio  ">
    public String fontePotassioAUsar() {
        switch (this.fonte_a_usar) {
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
        return this.resultado.getPotassio()/(this.resultado.getCalcio()+this.resultado.getMagnesio()+this.resultado.getPotassio()+this.resultado.getHidrogenio_aluminio())*100;
    }
    
    public int fontePotassio() {
        switch(this.fonte_a_usar){
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
