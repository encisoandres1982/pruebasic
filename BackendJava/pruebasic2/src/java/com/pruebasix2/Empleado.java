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
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByNumempleado", query = "SELECT e FROM Empleado e WHERE e.numempleado = :numempleado"),
    @NamedQuery(name = "Empleado.findByDependencia", query = "SELECT e FROM Empleado e WHERE e.dependencia = :dependencia"),
    @NamedQuery(name = "Empleado.findByFecha", query = "SELECT e FROM Empleado e WHERE e.fecha = :fecha")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numempleado")
    private Integer numempleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "dependencia")
    private String dependencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "fecha")
    private String fecha;

    public Empleado() {
    }

    public Empleado(Integer numempleado) {
        this.numempleado = numempleado;
    }

    public Empleado(Integer numempleado, String dependencia, String fecha) {
        this.numempleado = numempleado;
        this.dependencia = dependencia;
        this.fecha = fecha;
    }

    public Integer getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(Integer numempleado) {
        this.numempleado = numempleado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numempleado != null ? numempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.numempleado == null && other.numempleado != null) || (this.numempleado != null && !this.numempleado.equals(other.numempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pruebasix2.Empleado[ numempleado=" + numempleado + " ]";
    }
    
}
