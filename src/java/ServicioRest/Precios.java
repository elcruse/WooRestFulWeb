/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRest;

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
 * @author Jimmy
 */
@Entity
@Table(name = "precios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precios.findAll", query = "SELECT p FROM Precios p")
    , @NamedQuery(name = "Precios.findByIdprecio", query = "SELECT p FROM Precios p WHERE p.idprecio = :idprecio")
    , @NamedQuery(name = "Precios.findBySkuproduc", query = "SELECT p FROM Precios p WHERE p.skuproduc = :skuproduc")
    , @NamedQuery(name = "Precios.findByPrecompe", query = "SELECT p FROM Precios p WHERE p.precompe = :precompe")
    , @NamedQuery(name = "Precios.findByPrevenpe", query = "SELECT p FROM Precios p WHERE p.prevenpe = :prevenpe")})
public class Precios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprecio")
    private Integer idprecio;
    @Size(max = 45)
    @Column(name = "skuproduc")
    private String skuproduc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precompe")
    private float precompe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prevenpe")
    private float prevenpe;

    public Precios() {
    }

    public Precios(Integer idprecio) {
        this.idprecio = idprecio;
    }

    public Precios(Integer idprecio, float precompe, float prevenpe) {
        this.idprecio = idprecio;
        this.precompe = precompe;
        this.prevenpe = prevenpe;
    }

    public Integer getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Integer idprecio) {
        this.idprecio = idprecio;
    }

    public String getSkuproduc() {
        return skuproduc;
    }

    public void setSkuproduc(String skuproduc) {
        this.skuproduc = skuproduc;
    }

    public float getPrecompe() {
        return precompe;
    }

    public void setPrecompe(float precompe) {
        this.precompe = precompe;
    }

    public float getPrevenpe() {
        return prevenpe;
    }

    public void setPrevenpe(float prevenpe) {
        this.prevenpe = prevenpe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprecio != null ? idprecio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precios)) {
            return false;
        }
        Precios other = (Precios) object;
        if ((this.idprecio == null && other.idprecio != null) || (this.idprecio != null && !this.idprecio.equals(other.idprecio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ServicioRest.Precios[ idprecio=" + idprecio + " ]";
    }
    
}
