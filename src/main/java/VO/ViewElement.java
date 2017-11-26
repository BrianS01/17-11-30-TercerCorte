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

public abstract class ViewElement
{
    private String name;
    private InteractionFlow interactionFlow;
    
    public ViewElement()
    {
        InteractionFlow interactionFlow = new InteractionFlow() {};
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ViewElement{" + "name=" + name + '}';
    }
}