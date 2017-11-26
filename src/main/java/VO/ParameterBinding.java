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

public class ParameterBinding
{
    private int id;
    private Parameters target;
    private Parameters source;

    public ParameterBinding()
    {
        Parameters target = new Parameters();
        Parameters source = new Parameters();
    }
  
    public ParameterBinding(int id, Parameters target, Parameters source)
    {
        this.id = id;
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
        return "ParameterBinding{" + "id=" + id + ", target=" + target + ", source=" + source + '}';
    }
}