package com.manyroadsdev.java.model;

import java.util.List;

public class Recipe {
    private String strTitle;
    private List<String> categories;
    private String strYield;
    private List<Ingredient> ingredients;
    private List<String> directions;

    public Recipe(String strTitle, List<String> categories, String strYield, List<Ingredient> ingredients, List<String> directions) {
        this.strTitle = strTitle;
        this.categories = categories;
        this.strYield = strYield;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String getTitle() {
        return strTitle;
    }

    public void setTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getYield() {
        return strYield;
    }

    public void setYield(String strYield) {
        this.strYield = strYield;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }
}
