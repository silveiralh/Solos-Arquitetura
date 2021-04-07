/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solos.arquitetura.analise;
import com.solos.arquitetura.analise.Resultado;
import java.util.Date;

/**
 *
 * @author Rique
 */
public class Analise {
    private String produtor;
    private Date data;
    private String municipio;
    private float areaDoTalhao;
    private int talhao;
    private int texturaSolo;
    private int sistemaDeCultivo;
    private String responsávelTecnico;
    private Resultado resultadoAnalise;
    
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

    public float getareaDoTalhao() {
        return areaDoTalhao;
    }

    public void setareaDoTalhao(float areaDoTalhao) {
        this.areaDoTalhao = areaDoTalhao;
    }

    public int getTalhao() {
        return talhao;
    }

    public void setTalhao(int talhao) {
        this.talhao = talhao;
    }

    public int gettexturaSolo() {
        return texturaSolo;
    }

    public void settexturaSolo(int texturaSolo) {
        this.texturaSolo = texturaSolo;
    }

    public int getsistemaDeCultivo() {
        return sistemaDeCultivo;
    }

    public void setsistemaDeCultivo(int sistemaDeCultivo) {
        this.sistemaDeCultivo = sistemaDeCultivo;
    }

    public String getresponsávelTecnico() {
        return responsávelTecnico;
    }

    public void setresponsávelTecnico(String responsávelTecnico) {
        this.responsávelTecnico = responsávelTecnico;
    }

   public Resultado getresultadoAnalise() {
        return resultadoAnalise;
    }

    public void setresultadoAnalise(Resultado resultadoAnalise) {
        this.resultadoAnalise = resultadoAnalise;
    }
    //</editor-fold>

    
}
