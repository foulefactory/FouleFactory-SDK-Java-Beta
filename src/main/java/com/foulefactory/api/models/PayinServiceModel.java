/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PayinServiceModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4907887898517547309L;
    private int amount;
    private String returnUrl;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ReturnUrl")
    public String getReturnUrl ( ) { 
        return this.returnUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ReturnUrl")
    public void setReturnUrl (String value) { 
        this.returnUrl = value;
    }
 
}
 