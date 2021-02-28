/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.analise;

import java.util.Date;

/**
 *
 * @author Rique
 */
public class Analise {
    private String produtor;
    private Date data;
    private String municipio;
    private float area_do_talhao;
    private int talhao;
    private int textura_solo;
    private int sistema_de_cultivo;
    private String responsável_tecnico;
    private Resultado resultado_analise;
    
    // <editor-fold defaultstate="collapsed" desc=" Getters & Setters ">

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public float getArea_do_talhao() {
        return area_do_talhao;
    }

    public void setArea_do_talhao(float area_do_talhao) {
        this.area_do_talhao = area_do_talhao;
    }

    public int getTalhao() {
        return talhao;
    }

    public void setTalhao(int talhao) {
        this.talhao = talhao;
    }

    public int getTextura_solo() {
        return textura_solo;
    }

    public void setTextura_solo(int textura_solo) {
        this.textura_solo = textura_solo;
    }

    public int getSistema_de_cultivo() {
        return sistema_de_cultivo;
    }

    public void setSistema_de_cultivo(int sistema_de_cultivo) {
        this.sistema_de_cultivo = sistema_de_cultivo;
    }

    public String getResponsável_tecnico() {
        return responsável_tecnico;
    }

    public void setResponsável_tecnico(String responsável_tecnico) {
        this.responsável_tecnico = responsável_tecnico;
    }

   public Resultado getResultado_analise() {
        return resultado_analise;
    }

    public void setResultado_analise(Resultado resultado_analise) {
        this.resultado_analise = resultado_analise;
    }
    //</editor-fold>

    
}
