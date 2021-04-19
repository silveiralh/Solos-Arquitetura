/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.analise;

/**
 *
 * @author Rique
 */
public class Resultado {
    private int numero_analise;
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hidrogenioAluminio;
    private double MO;

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getHidrogenioAluminio() {
        return hidrogenioAluminio;
    }

    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Funções para definição dos campos S cmol, CTC cmol, V%  atual, teor de M.O. e Carbono  ">
    
    public double calculoScmol(){
        return (this.potassio +this.calcio+this.magnesio);
    }
    
    public double calculoCTCmol(){
        return (calculoScmol()+this.hidrogenioAluminio);
    }
    
    public double calculoVAtual(){
        return(100*(calculoScmol()/calculoCTCmol()));
    }
    
    public double calculoTeorMO(){
        return(this.MO/10);
    }
    
    public double calculoCarbono(){
        return(calculoTeorMO()/(1.72*10));
    }
    
    //</editor-fold>
}
