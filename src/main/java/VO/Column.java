/*
 *  Taller WEB
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package VO;

public class Column
{
    protected String name;
    protected String type;
    protected int size;
    private String defaultValue;
    private boolean isRequired;
    private boolean acceptNull;
    protected String alias;
    protected String comment;
    protected String helpMessage;
    private Parameters reference;

    public Column()
    {}
            
    public Column(String name, String type, int size, String defaultValue, boolean isRequired, boolean acceptNull, String alias, String comment, String helpMessage)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.defaultValue = defaultValue;
        this.isRequired = isRequired;
        this.acceptNull = acceptNull;
        this.alias = alias;
        this.comment = comment;
        this.helpMessage = helpMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isIsRequired() {
        return isRequired;
    }

    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public boolean isAcceptNull() {
        return acceptNull;
    }

    public void setAcceptNull(boolean acceptNull) {
        this.acceptNull = acceptNull;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public Parameters getReference() {
        return reference;
    }

    public void setReference(Parameters reference) {
        this.reference = reference;
    }

    @Override
    public String toString()
    {
        return "Column{" + "name=" + name + ", type=" + type + ", size=" + size + ", defaultValue=" + defaultValue + ", isRequired=" + isRequired + ", acceptNull=" + acceptNull + ", alias=" + alias + ", comment=" + comment + ", helpMessage=" + helpMessage + ", reference=" + reference + '}';
    }
}