package org.belajarbarengjava.bpakar.model.impl;

import org.belajarbarengjava.bpakar.model.spec.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by ferdinand on 3/12/15.
 */
@MappedSuperclass
public class BaseEntityImpl implements BaseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "theid", unique = true)
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
