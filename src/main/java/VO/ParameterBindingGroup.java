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

public class ParameterBindingGroup
{
    private int id;
    private ParameterBinding parameterBinding;

    public ParameterBindingGroup()
    {
        ParameterBinding parameterBinding = new ParameterBinding();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ParameterBindingGroup{" + "id=" + id + ", parameterBinding=" + parameterBinding + '}';
    } 
}