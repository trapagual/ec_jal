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
@Table(name = "vcountry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vcountry.findAll", query = "SELECT v FROM Vcountry v")
    , @NamedQuery(name = "Vcountry.findByCode", query = "SELECT v FROM Vcountry v WHERE v.code = :code")
    , @NamedQuery(name = "Vcountry.findByName", query = "SELECT v FROM Vcountry v WHERE v.name = :name")
    , @NamedQuery(name = "Vcountry.findByCapital", query = "SELECT v FROM Vcountry v WHERE v.capital = :capital")
    , @NamedQuery(name = "Vcountry.findByCode2", query = "SELECT v FROM Vcountry v WHERE v.code2 = :code2")})
public class Vcountry implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 52)
    @Column(name = "Name")
    private String name;
    @Column(name = "Capital")
    private Integer capital;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Code2")
    private String code2;

    public Vcountry() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
    
}
