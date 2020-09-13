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
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s")
    , @NamedQuery(name = "Stock.findByIdstock", query = "SELECT s FROM Stock s WHERE s.idstock = :idstock")
    , @NamedQuery(name = "Stock.findBySkuproducto", query = "SELECT s FROM Stock s WHERE s.skuproducto = :skuproducto")
    , @NamedQuery(name = "Stock.findByStockdisp", query = "SELECT s FROM Stock s WHERE s.stockdisp = :stockdisp")})
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idstock")
    private Integer idstock;
    @Size(max = 45)
    @Column(name = "skuproducto")
    private String skuproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stockdisp")
    private int stockdisp;

    public Stock() {
    }

    public Stock(Integer idstock) {
        this.idstock = idstock;
    }

    public Stock(Integer idstock, int stockdisp) {
        this.idstock = idstock;
        this.stockdisp = stockdisp;
    }

    public Integer getIdstock() {
        return idstock;
    }

    public void setIdstock(Integer idstock) {
        this.idstock = idstock;
    }

    public String getSkuproducto() {
        return skuproducto;
    }

    public void setSkuproducto(String skuproducto) {
        this.skuproducto = skuproducto;
    }

    public int getStockdisp() {
        return stockdisp;
    }

    public void setStockdisp(int stockdisp) {
        this.stockdisp = stockdisp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstock != null ? idstock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idstock == null && other.idstock != null) || (this.idstock != null && !this.idstock.equals(other.idstock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ServicioRest.Stock[ idstock=" + idstock + " ]";
    }
    
}
