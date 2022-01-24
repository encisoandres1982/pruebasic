/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebasix2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@Entity
@Table(name = "tramite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tramite.findAll", query = "SELECT t FROM Tramite t"),
    @NamedQuery(name = "Tramite.findByNumtramite", query = "SELECT t FROM Tramite t WHERE t.numtramite = :numtramite"),
    @NamedQuery(name = "Tramite.findByAno", query = "SELECT t FROM Tramite t WHERE t.ano = :ano"),
    @NamedQuery(name = "Tramite.findByNombretramite", query = "SELECT t FROM Tramite t WHERE t.nombretramite = :nombretramite"),
    @NamedQuery(name = "Tramite.findByDescripcion", query = "SELECT t FROM Tramite t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tramite.findByNumempleado", query = "SELECT t FROM Tramite t WHERE t.numempleado = :numempleado"),
    @NamedQuery(name = "Tramite.findByNumdocpersona", query = "SELECT t FROM Tramite t WHERE t.numdocpersona = :numdocpersona")})
public class Tramite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numtramite")
    private Integer numtramite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ano")
    private int ano;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombretramite")
    private String nombretramite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numempleado")
    private int numempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numdocpersona")
    private int numdocpersona;

    public Tramite() {
    }

    public Tramite(Integer numtramite) {
        this.numtramite = numtramite;
    }

    public Tramite(Integer numtramite, int ano, String nombretramite, String descripcion, int numempleado, int numdocpersona) {
        this.numtramite = numtramite;
        this.ano = ano;
        this.nombretramite = nombretramite;
        this.descripcion = descripcion;
        this.numempleado = numempleado;
        this.numdocpersona = numdocpersona;
    }

    public Integer getNumtramite() {
        return numtramite;
    }

    public void setNumtramite(Integer numtramite) {
        this.numtramite = numtramite;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNombretramite() {
        return nombretramite;
    }

    public void setNombretramite(String nombretramite) {
        this.nombretramite = nombretramite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public int getNumdocpersona() {
        return numdocpersona;
    }

    public void setNumdocpersona(int numdocpersona) {
        this.numdocpersona = numdocpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numtramite != null ? numtramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.numtramite == null && other.numtramite != null) || (this.numtramite != null && !this.numtramite.equals(other.numtramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pruebasix2.Tramite[ numtramite=" + numtramite + " ]";
    }
    
}
