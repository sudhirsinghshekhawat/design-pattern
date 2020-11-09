package com.patterns.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();

        }
        return clone;
    }
}
