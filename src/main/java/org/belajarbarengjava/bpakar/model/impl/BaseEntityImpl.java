package org.belajarbarengjava.bpakar.model.impl;

import org.belajarbarengjava.bpakar.model.spec.BaseEntity;

/**
 * Created by ferdinand on 3/12/15.
 */
public class BaseEntityImpl implements BaseEntity {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
