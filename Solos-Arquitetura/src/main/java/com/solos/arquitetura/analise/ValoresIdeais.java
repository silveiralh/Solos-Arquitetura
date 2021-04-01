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
public class ValoresIdeais {
    
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
     //</editor-fold>
}