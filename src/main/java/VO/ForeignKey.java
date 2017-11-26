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

public class ForeignKey extends Column
{
    public boolean contaiment;
    
    public ForeignKey(boolean contaiment, String name, String type, int size, String defaultValue, boolean isRequired, boolean acceptNull, String alias, String comment, String helpMessage)
    {
        super(name, type, size, defaultValue, isRequired, acceptNull, alias, comment, helpMessage);
        this.contaiment = contaiment;
    }
    
    
}
