package com.testes.agenda.entidade;


import java.io.Serializable;

/**
 * Created by cristian on 30/05/16.
 */
public class Gosto implements Serializable{

    private String tipoGosto;
    private String gosto;

    public String getTipoGosto() {
        return tipoGosto;
    }

    public void setTipoGosto(String tipoGosto) {
        this.tipoGosto = tipoGosto;
    }

    public String getGosto() {
        return gosto;
    }

    public void setGosto(String gosto) {
        this.gosto = gosto;
    }
}
