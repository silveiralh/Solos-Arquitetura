/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.fosforo;

/**
 *
 * @author Rique
 */

public enum FontesFosforo {
    SUPERFOSFATO_SIMPLES(18.0),
    SUPERFOSFATO_TRIPLO(41.0),
    MAP(48.0),
    DAP(45.0),
    YOORIN(18.0),
    FOSFATO_ARAD(33.0),
    FOSFATO_GAFSA(29.0),
    FOSFATO_DAOUI(32.0),
    FOSFATO_PATO_MINAS(24.0),
    ESCORIA_DE_THOMAS(18.5),
    ACIDO_FOSFORICO(52.0),
    MULTIF_MAGNESIANO(18.0);
    
    private final double valorFonteFosforo;

    public double getValorFonteFosforo() {
        return valorFonteFosforo;
    }
    
    FontesFosforo(double valorFonteFosforo){
        this.valorFonteFosforo = valorFonteFosforo;
    }
    
}
