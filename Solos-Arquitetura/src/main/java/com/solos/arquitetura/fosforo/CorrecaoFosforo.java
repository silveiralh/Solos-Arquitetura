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
        if(this.teorDesejado - this.resultado.getFosforo()>0.01){
            return ((this.teorDesejado - this.resultado.getFosforo()) * 2 * 2.29 * 100 / this.eficiencia) * 100/ this.fonteAUtilizar.getValorFonteFosforo();
        }else{
            return 0.00;
        }
    }
    
    public double campoCorrecaoUm(){
        return this.quantidadeParaAplicar()*this.fonteAUtilizar.getCampoCorrecaoUm();
    }
    
    public String campoCorrecaoDois(){
        return this.fonteAUtilizar.getCampoCorrecaoDois();
    }
    
    public double campoCorrecaoTres(){
        return quantidadeParaAplicar()* this.fonteAUtilizar.getCampoCorrecaoTres();
    }
    
    public String campoCorrecaoQuatro(){
        return this.fonteAUtilizar.getCampoCorrecaoQuatro();
    }
    
    double custo() {
        return this.fonteAUtilizar.getValorFonteFosforo() * this.quantidadeParaAplicar()/1000;
    }
}
