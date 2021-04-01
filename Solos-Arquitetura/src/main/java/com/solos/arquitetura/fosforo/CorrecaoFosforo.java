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

    private double teor_desejado;
    private int fonte_a_utilizar;
    private double eficiencia;
    private Resultado resultado;

    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">
    public double getTeor_desejado() {
        return teor_desejado;
    }

    public void setTeor_desejado(double teor_desejado) {
        this.teor_desejado = teor_desejado;
    }

    public double getFonte_a_utilizar() {
        return fonte_a_utilizar;
    }

    public void setFonte_a_utilizar(int fonte_a_utilizar) {
        this.fonte_a_utilizar = fonte_a_utilizar;
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
        switch (this.fonte_a_utilizar) {
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

        switch (this.fonte_a_utilizar) {
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
        return ((this.teor_desejado - this.resultado.getFosforo()) * 2 * 2.29 * 100 / this.eficiencia / 100) * (100 / this.valorFonteFosforo());
    }

    public String campoCorrecaoFosforo1() {
        switch (this.fonte_a_utilizar) {
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
        switch (this.fonte_a_utilizar) {
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
