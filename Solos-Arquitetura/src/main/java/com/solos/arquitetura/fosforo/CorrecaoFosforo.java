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
    private int fonteAUtilizar;
    private double eficiencia;
    private Resultado resultado;

    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">
    public double getteorDesejado() {
        return teorDesejado;
    }

    public void setteorDesejado(double teorDesejado) {
        this.teorDesejado = teorDesejado;
    }

    public double getfonteAUtilizar() {
        return fonteAUtilizar;
    }

    public void setfonteAUtilizar(int fonteAUtilizar) {
        this.fonteAUtilizar = fonteAUtilizar;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Quantidade a aplicar, Fonte de fosforo a utilizar, Custo  ">
    public String fonteDeFosforo() {
        switch (this.fonteAUtilizar) {
            case (1):
                return "Superfosfato Simples";
            case (2):
                return "Superfosfato Triplo";
            case (3):
                return "MAP";
            case (4):
                return "DAP";
            case (5):
                return "Termofosfato Yoorin";
            case (6):
                return "Fosfato Reat. Arad";
            case (7):
                return "Fosfato  Gafsa";
            case (8):
                return "Fosfato  Daoui";
            case (9):
                return "Fosf.  Patos Minas";
            case (10):
                return "Escória de Thomas";
            case (11):
                return "Ácido Fosfórico ";
            case (12):
                return "Multif.Magnesiano";
            default:
                return "";

        }
    }

    public double valorFonteFosforo() {

        switch (this.fonteAUtilizar) {
            case (1):
                return 18.0;
            case (2):
                return 41.0;
            case (3):
                return 48.0;
            case (4):
                return 45.0;
            case (5):
                return 18.0;
            case (6):
                return 33.0;
            case (7):
                return 29.0;
            case (8):
                return 32.0;
            case (9):
                return 24.0;
            case (10):
                return 18.5;
            case (11):
                return 52.0;
            case (12):
                return 18.0;
            default:
                return 0.0;
        }
    }

    public double quantidadeParaAplicar() {
        return ((this.teorDesejado - this.resultado.getFosforo()) * 2 * 2.29 * 100 / this.eficiencia / 100) * (100 / this.valorFonteFosforo());
    }

    public String campoCorrecaoFosforo1() {
        switch (this.fonteAUtilizar) {
            case 1:
                return this.quantidadeParaAplicar()*0.1 + "- Enxofre";
            case 5:
                return this.quantidadeParaAplicar() * 0.15 + "- Magnésio";
            case 12:
                return this.quantidadeParaAplicar() * 0.11 + "- Enxofre";
            default:
                return "";
        }

    }
    
    public String campoCorrecaoFosforo2(){
        switch (this.fonteAUtilizar) {
            case (1):
                return this.quantidadeParaAplicar()*0.28 + "- Calcio";
            case (2):
                return this.quantidadeParaAplicar()*0.2 + "- Calcio";
            case (3):
                return this.quantidadeParaAplicar()*0.09 + "- Nitrogenio";
            case (4):
                return this.quantidadeParaAplicar()*0.16 + "- Nitrogenio";
            case (5):
                return this.quantidadeParaAplicar()*0.28 + "- Calcio";
            case (6):
                return this.quantidadeParaAplicar()*0.52 + "- Calcio";
            case (7):
                return this.quantidadeParaAplicar()*0.52 + "- Calcio";
            case (8):
                return this.quantidadeParaAplicar()*0.45 + "- Calcio";
            case (9):
                return this.quantidadeParaAplicar()*0.28 + "- Calcio";
            case (10):
                return this.quantidadeParaAplicar()*0.44 + "- Calcio";
            case (11):
                return this.quantidadeParaAplicar()*0.0 + "- Calcio";
            case (12):
                return this.quantidadeParaAplicar()*0.18 + "- Calcio";
            default:
                return "";
        }
    }
    
     //</editor-fold>

}
