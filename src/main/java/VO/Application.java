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

public class Application
{
    private String name;
    private String description;
    public Schema domainModel;
    public ViewContainer vistaContenida;
    
    public void vista(ViewContainer vista)
    {
        vistaContenida = vista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Schema getDomainModel() {
        return domainModel;
    }

    public void setDomainModel(Schema domainModel) {
        this.domainModel = domainModel;
    }

    public ViewContainer getVistaContenida() {
        return vistaContenida;
    }

    public void setVistaContenida(ViewContainer vistaContenida) {
        this.vistaContenida = vistaContenida;
    }

    @Override
    public String toString() {
        return "Application{" + "name=" + name + ", description=" + description + ", domainModel=" + domainModel + ", vistaContenida=" + vistaContenida + '}';
    }
}