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
    private double hidrogenio_aluminio;
    private double MO;
    
    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">

    public int getNumero_analise() {
        return numero_analise;
    }

    public void setNumero_analise(int numero_analise) {
        this.numero_analise = numero_analise;
    }

    public double getFosforo() {
        return fosforo;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }
    
     public double getHidrogenio_aluminio() {
        return hidrogenio_aluminio;
    }

    public void setHidrogenio_aluminio(double hidrogenio_aluminio) {
        this.hidrogenio_aluminio = hidrogenio_aluminio;
    }
    
    public double getMO() {
        return MO;
    }

    public void setMO(double MO) {
        this.MO = MO;
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Funções para cálculo de valores ideais  ">
    
    public double fosforoIdeal(int textura_solo){
        if(textura_solo ==1){
            return 9.0;
        }else if(textura_solo==2){
            return 12.0;
        }else{
            return -1.0;
        }
    }
    
    public double potassioIdeal(int textura_solo){
        if(textura_solo ==1){
            return 0.35;
        }else if(textura_solo==2){
            return 0.25;
        }else{
            return -1.0;
        }
    }
    
    public double calcioIdeal(int textura_solo){
        if(textura_solo ==1){
            return 6.0;
        }else if(textura_solo==2){
            return 4.0;
        }else{
            return -1.0;
        }
    }
    
    public double magnesioIdeal(int textura_solo){
        if(textura_solo ==1){
            return 1.5;
        }else if(textura_solo==2){
            return 1.0;
        }else{
            return -1.0;
        }
    }
    
    public double enxofreIdeal(int textura_solo){
        if(textura_solo ==1){
            return 9.0;
        }else if(textura_solo==2){
            return 6.0;
        }else{
            return -1.0;
        }
    }
    
    public double calculoScmol(){
        return (this.potassio +this.calcio+this.magnesio);
    }
    
    public double calculoCTCmol(){
        return (calculoScmol()+this.hidrogenio_aluminio);
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
