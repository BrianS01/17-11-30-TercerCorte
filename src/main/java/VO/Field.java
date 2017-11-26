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

public abstract class Field
{
    protected String name;
    protected String type;
    protected String helpMessage;
    protected String comment;
    public String initialValue;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getHelpMessage()
    {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage)
    {
        this.helpMessage = helpMessage;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getInitialValue()
    {
        return initialValue;
    }

    public void setInitialValue(String initialValue)
    {
        this.initialValue = initialValue;
    }

    @Override
    public String toString()
    {
        return "Field{" + "name=" + name + ", type=" + type + ", helpMessage=" + helpMessage + ", comment=" + comment + ", initialValue=" + initialValue + '}';
    }
}