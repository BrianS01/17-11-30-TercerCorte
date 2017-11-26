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

public class Table
{
    public String name;
    public int oid;
    private Key keys;
    public ForeignKey tables;
    public ViewComponent source;
    private ForeignKey foreignKey;
    
    public Table()
    {}

    public Table(String name, int oid, Key keys, ForeignKey tables, ViewComponent source, ForeignKey foreignKey)
    {
        this.name = name;
        this.oid = oid;
        this.keys = keys;
        this.tables = tables;
        this.source = source;
        this.foreignKey = foreignKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Key getKeys() {
        return keys;
    }

    public void setKeys(Key keys) {
        this.keys = keys;
    }

    public ForeignKey getTables() {
        return tables;
    }

    public void setTables(ForeignKey tables) {
        this.tables = tables;
    }

    public ViewComponent getSource() {
        return source;
    }

    public void setSource(ViewComponent source) {
        this.source = source;
    }

    public ForeignKey getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(ForeignKey foreignKey) {
        this.foreignKey = foreignKey;
    }
}