package com.pinnacle.restfulwebservices.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author thewallasher
 */
@Entity

public class Properties {
	
    @Id
    @NotNull
    private Integer propertyid;
    @NotNull
    @Size(min = 1, max = 500, message="Default value must be between 1 and 500 characters")
    private String defaultvalue;
    @NotNull
    @Size(min = 1, max = 500, message="Value must be between 1 and 5000 characters")
    private String value;
    @NotNull
    @Size(min = 1, max = 60, message="Name must be between 1 and 60 characters")
    private String name;
    @Size(max = 1000, message="Name must be less than 1000")
    private String comments;

    public Properties() {
    }

    public Properties(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public Properties(Integer propertyid, String value, String name) {
        this.propertyid = propertyid;
        this.value = value;
        this.name = name;
    }

    public Integer getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyid != null ? propertyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Properties)) {
            return false;
        }
        Properties other = (Properties) object;
        if ((this.propertyid == null && other.propertyid != null) || (this.propertyid != null && !this.propertyid.equals(other.propertyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pinnacle.entity.Properties[ propertyid=" + propertyid + " ]";
    }
    
}

