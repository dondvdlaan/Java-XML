package com.manyroadsdev.java.model;

public class Ingredient {

    private String strQuantity;
    private String strUnit;
    private String strItem;

    public Ingredient(String strQuantity, String strUnit, String strItem) {
        this.strQuantity = strQuantity;
        this.strUnit = strUnit;
        this.strItem = strItem;
    }

    public String getQantity() {
        return strQuantity;
    }

    public void setQuantity(String strQuantity) {
        this.strQuantity = strQuantity;
    }

    public String getUnit() {
        return strUnit;
    }

    public void setUnit(String strUnit) {
        this.strUnit = strUnit;
    }

    public String gettem() {
        return strItem;
    }

    public void setItem(String strItem) {
        this.strItem = strItem;
    }
}
