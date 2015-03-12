package org.belajarbarengjava.bpakar.model.spec;

/**
 * This interface is the basis of all data model.
 * Its defining that all data model must have a <code>getId</code> method to obtain the
 * record ID number.
 *
 *
 * Created by ferdinand on 3/11/15.
 */
public interface BaseEntity {

    /**
     * Get the model's record ID number.
     *
     * @return  Unique number denoting its record ID. This id will return null when the object is new and not persisted.
     *          non null if the object has been persisted.
     */
    public String getId();

}
