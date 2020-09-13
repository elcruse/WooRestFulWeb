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
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdproducto", query = "SELECT p FROM Productos p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Productos.findBySkuproducto", query = "SELECT p FROM Productos p WHERE p.skuproducto = :skuproducto")
    , @NamedQuery(name = "Productos.findByDescproduc", query = "SELECT p FROM Productos p WHERE p.descproduc = :descproduc")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 45)
    @Column(name = "skuproducto")
    private String skuproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descproduc")
    private String descproduc;

    public Productos() {
    }

    public Productos(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Productos(Integer idproducto, String descproduc) {
        this.idproducto = idproducto;
        this.descproduc = descproduc;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getSkuproducto() {
        return skuproducto;
    }

    public void setSkuproducto(String skuproducto) {
        this.skuproducto = skuproducto;
    }

    public String getDescproduc() {
        return descproduc;
    }

    public void setDescproduc(String descproduc) {
        this.descproduc = descproduc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ServicioRest.Productos[ idproducto=" + idproducto + " ]";
    }
    
}
