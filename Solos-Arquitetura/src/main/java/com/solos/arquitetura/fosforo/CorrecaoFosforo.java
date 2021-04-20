/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.fosforo;

import com.solos.arquitetura.analise.Resultado;

/**
 *
 * @author Rique
 */
public class CorrecaoFosforo {

    private double teorDesejado;
    private FontesFosforo fonteAUtilizar;
    private double eficiencia;
    private Resultado resultado;
    
    public CorrecaoFosforo( double teorDesejado, FontesFosforo fonteAUtilizar, double eficiencia, Resultado resultado) {
        this.teorDesejado = teorDesejado;
        this.fonteAUtilizar = fonteAUtilizar;
        this.eficiencia = eficiencia;
        this.resultado = resultado;
    }
    // <editor-fold defaultstate="collapsed" desc=" Quantidade a aplicar, Fonte de fosforo a utilizar, Custo  ">

    public double quantidadeParaAplicar() {
        return ((this.teorDesejado - this.resultado.getFosforo()) * 2 * 2.29 * 100 / this.eficiencia / 100) * (100 / this.fonteAUtilizar.getValorFonteFosforo());
    }

    public String campoCorrecaoFosforo(){
        switch (this.fonteAUtilizar) {
            case SUPERFOSFATO_SIMPLES:
                return this.quantidadeParaAplicar()*0.28 + "- Calcio - " + this.quantidadeParaAplicar()*0.1 + "- Enxofre";
            case SUPERFOSFATO_TRIPLO:
                return this.quantidadeParaAplicar()*0.2 + "- Calcio";
            case MAP:
                return this.quantidadeParaAplicar()*0.09 + "- Nitrogenio";
            case DAP:
                return this.quantidadeParaAplicar()*0.16 + "- Nitrogenio";
            case YOORIN:
                return this.quantidadeParaAplicar()*0.28 + "- Calcio - "+ this.quantidadeParaAplicar() * 0.15 + "- Magnésio";
            case FOSFATO_ARAD:
                return this.quantidadeParaAplicar()*0.52 + "- Calcio";
            case FOSFATO_GAFSA:
                return this.quantidadeParaAplicar()*0.52 + "- Calcio";
            case FOSFATO_DAOUI:
                return this.quantidadeParaAplicar()*0.45 + "- Calcio";
            case FOSFATO_PATO_MINAS:
                return this.quantidadeParaAplicar()*0.28 + "- Calcio";
            case ESCORIA_DE_THOMAS:
                return this.quantidadeParaAplicar()*0.44 + "- Calcio";
            case ACIDO_FOSFORICO:
                return this.quantidadeParaAplicar()*0.0 + "- Calcio";
            case MULTIF_MAGNESIANO:
                return this.quantidadeParaAplicar()*0.18 + "- Calcio - " + this.quantidadeParaAplicar() * 0.11 + "- Enxofre";
            default:
                return "";
        }
    }
    
    double custo() {
        return this.fonteAUtilizar.getValorFonteFosforo() * this.quantidadeParaAplicar()/1000;
    }
     //</editor-fold>

}
