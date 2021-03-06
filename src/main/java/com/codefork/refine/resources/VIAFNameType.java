
package com.codefork.refine.resources;

/**
 * Name Types are a JSON object found in the service metadata
 * and in the results data.
 */
public class VIAFNameType {

    private String id;
    private String name;

    public VIAFNameType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof VIAFNameType) {
            VIAFNameType obj2 = (VIAFNameType) obj;
            return obj2.getId().equals(getId())
                    && obj2.getName().equals(getName());
        }
        return false;
    }
}
