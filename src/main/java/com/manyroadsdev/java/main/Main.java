package com.manyroadsdev.java.main;

import com.manyroadsdev.java.logic.RecipeMLwriter;
import com.manyroadsdev.java.model.Ingredient;
import com.manyroadsdev.java.model.Recipe;

import javax.xml.stream.XMLStreamException;
import java.util.Arrays;

//end::solution-a[]

public class Main {

    //tag::solution-b[]
    static Recipe generateRandomRecipe() {
        Ingredient ingredient1 = new Ingredient( "30", "cups", "fat" );
        Ingredient ingredient2 = new Ingredient( "1", "kg", "sugar" );
        return new Recipe( "Fat Jam", Arrays.asList( "Canning", "Preserves" ), "8",
                Arrays.asList( ingredient1, ingredient2 ),
                Arrays.asList( "Start", "End" ) );
    }
    //end::solution-b[]

    public static void main( String[] args ) throws XMLStreamException {
        Recipe recipe = generateRandomRecipe();
        RecipeMLwriter.writeRecipeAsXml( System.out, recipe );
    }
}

//end::solution-c[]

/*
<recipeml version="0.5">
  <recipe>
    <head>
      <title>11 Minute Strawberry Jam</title>
      <categories>
        <cat>Canning</cat>
        <cat>Preserves</cat>
        <cat>Jams &amp; jell</cat>
      </categories>
      <yield>8</yield>
    </head>
    <ingredients>
      <ing>
        <amt>
          <qty>3</qty>
          <unit>cups</unit>
        </amt>
        <item>Strawberries</item>
      </ing>
      <ing>
        <amt>
          <qty>3</qty>
          <unit>cups</unit>
        </amt>
        <item>Sugar</item>
      </ing>
    </ingredients>
    <directions>
      <step>Put the strawberries in a pan.</step>
      <step>Add 1 cup of sugar.</step>
      <step>Bring to a boil and boil for 4 minutes.</step>
      <step>Add the second cup of sugar and boil again for 4 minutes.</step>
      <step>Then add the third cup of sugar and boil for 3 minutes.</step>
      <step>Remove from stove, cool, stir occasionally.</step>
      <step>Pour in jars and seal.</step>
    </directions>
  </recipe>
</recipeml>
 */
