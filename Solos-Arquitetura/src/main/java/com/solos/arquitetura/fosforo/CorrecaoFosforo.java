package com.solos.arquitetura.fosforo;

import com.solos.arquitetura.analise.Resultado;

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

    public double quantidadeParaAplicar() {
        return ((this.teorDesejado - this.resultado.getFosforo()) * 2 * 2.29 * 100 / this.eficiencia / 100) * (100 / this.fonteAUtilizar.getValorFonteFosforo());
    }

    public String campoCorrecaoFosforo(){
        return this.quantidadeParaAplicar()*this.fonteAUtilizar.getCampoCorrecaoUm()+ " - " + this.fonteAUtilizar.getCampoCorrecaoDois() + " - " + quantidadeParaAplicar()* this.fonteAUtilizar.getCampoCorrecaoTres() + " - "+this.fonteAUtilizar.getCampoCorrecaoQuatro();
    }
    
    double custo() {
        return this.fonteAUtilizar.getValorFonteFosforo() * this.quantidadeParaAplicar()/1000;
    }
}
