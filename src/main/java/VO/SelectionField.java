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

public class SelectionField
{
    public boolean isMultiSelection;

    public boolean isIsMultiSelection()
    {
        return isMultiSelection;
    }

    public void setIsMultiSelection(boolean isMultiSelection)
    {
        this.isMultiSelection = isMultiSelection;
    }

    @Override
    public String toString()
    {
        return "SelectionField{" + "isMultiSelection=" + isMultiSelection + '}';
    }
}
