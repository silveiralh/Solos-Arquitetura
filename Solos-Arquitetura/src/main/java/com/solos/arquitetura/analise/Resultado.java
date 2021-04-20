package com.solos.arquitetura.analise;

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

}
