/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.velsoft.eg.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SGEN0290
 */
@Entity
@Table(name = "vcity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vcity.findAll", query = "SELECT v FROM Vcity v")
    , @NamedQuery(name = "Vcity.findById", query = "SELECT v FROM Vcity v WHERE v.id = :id")
    , @NamedQuery(name = "Vcity.findByName", query = "SELECT v FROM Vcity v WHERE v.name = :name")
    , @NamedQuery(name = "Vcity.findByCountryCode", query = "SELECT v FROM Vcity v WHERE v.countryCode = :countryCode")
    , @NamedQuery(name = "Vcity.findByDistrict", query = "SELECT v FROM Vcity v WHERE v.district = :district")})
public class Vcity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CountryCode")
    private String countryCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "District")
    private String district;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Info")
    private String info;

    public Vcity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
}
