package org.muttie.domain;

import org.raviolini.domain.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import lombok.Data;

@DatabaseTable(tableName = "dog")
public @Data class Dog implements Entity {
    
    @DatabaseField(generatedId = true)
    private Integer id;
    
    @DatabaseField
    private String name;
    
    @DatabaseField
    private Boolean neutered;
    
    public Dog() {
        //Required by ORM.
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    @JsonIgnore
    public Boolean isValid() {
        return (neutered != null && name != null && !name.isEmpty());
    }
}