/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateQuestionWriterServiceModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5492802216734547997L;
    private String title;
    private boolean require;
    private int idTemplateObjectQuestionType;
    private int order;
    private String option;
    private List<String> choices;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Require")
    public boolean getRequire ( ) { 
        return this.require;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Require")
    public void setRequire (boolean value) { 
        this.require = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdTemplateObjectQuestionType")
    public int getIdTemplateObjectQuestionType ( ) { 
        return this.idTemplateObjectQuestionType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdTemplateObjectQuestionType")
    public void setIdTemplateObjectQuestionType (int value) { 
        this.idTemplateObjectQuestionType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Order")
    public void setOrder (int value) { 
        this.order = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Option")
    public String getOption ( ) { 
        return this.option;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Option")
    public void setOption (String value) { 
        this.option = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Choices")
    public List<String> getChoices ( ) { 
        return this.choices;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Choices")
    public void setChoices (List<String> value) { 
        this.choices = value;
    }
 
}
 