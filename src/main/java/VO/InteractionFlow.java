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

public abstract class InteractionFlow
{
    private String name;
    private int id;
    public String typeEvent;
    private ViewElement interactionFlow;

    public InteractionFlow()
    {
        ParameterBindingGroup parameterBindingGroup = new ParameterBindingGroup();
    }
            
    public InteractionFlow(String name, int id, String typeEvent, ViewElement interactionFlow) {
        this.name = name;
        this.id = id;
        this.typeEvent = typeEvent;
        this.interactionFlow = interactionFlow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }

    public ViewElement getInteractionFlow() {
        return interactionFlow;
    }

    public void setInteractionFlow(ViewElement interactionFlow) {
        this.interactionFlow = interactionFlow;
    }

    @Override
    public String toString() {
        return "InteractionFlow{" + "name=" + name + ", id=" + id + ", typeEvent=" + typeEvent + ", interactionFlow=" + interactionFlow + '}';
    }
}