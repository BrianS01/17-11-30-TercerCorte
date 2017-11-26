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

public class Form extends ViewComponent
{
    private Field field;

    public Form(Field field)
    {
        field = new Field() {};
    }

    public Field getField()
    {
        return field;
    }

    public void setField(Field field)
    {
        this.field = field;
    }

    @Override
    public String toString()
    {
        return "Form{" + "field=" + field + '}';
    }
}