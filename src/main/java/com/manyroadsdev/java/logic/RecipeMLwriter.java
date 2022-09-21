package com.manyroadsdev.java.logic;

import com.manyroadsdev.java.model.Ingredient;
import com.manyroadsdev.java.model.Recipe;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

//tag::solution-c[]
public class RecipeMLwriter {
    public static void writeRecipeAsXml(OutputStream outputStream, Recipe recipe)
            throws XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(outputStream,
                StandardCharsets.UTF_8.name());
        writeRecipeElements(writer, recipe);
        writer.close();   // This does not close the underlying output stream
    }

    private static void writeRecipeElements(XMLStreamWriter writer, Recipe recipe)
            throws XMLStreamException {
        writer.writeStartDocument("utf-8", "1.0");
        writer.writeComment("Recipe");

        writer.writeStartElement("recipe");

        writer.writeStartElement("head");

        writeCharacters(writer, "title", recipe.getTitle());

        writer.writeStartElement("categories");
        for (String cat : recipe.getCategories())
            writeCharacters(writer, "cat", cat);
        writer.writeEndElement(); // </categories>

        writeCharacters(writer, "yield", recipe.getYield());

        writer.writeEndElement(); // </head>

        writer.writeStartElement("ingredients");
        for (Ingredient ingredient : recipe.getIngredients())
            writeIngredientElements(writer, ingredient);
        writer.writeEndElement(); // </ingredients>

        writer.writeStartElement("directions");

        for (String step : recipe.getDirections())
            writeCharacters(writer, "step", step);

        writer.writeEndElement(); // </directions>
        writer.writeEndElement(); // </recipe>
        writer.writeEndDocument();
    }

    private static void writeIngredientElements(XMLStreamWriter writer, Ingredient ingredient)
            throws XMLStreamException {
        writer.writeStartElement("ing");

        writer.writeStartElement("amt");
        writeCharacters(writer, "qty", ingredient.getQantity());
        writeCharacters(writer, "unit", ingredient.getUnit());
        writer.writeEndElement(); // </amt>

        writeCharacters(writer, "item", ingredient.gettem());

        writer.writeEndElement(); // </ing>
    }

    private static void writeCharacters(XMLStreamWriter writer, String name, String string)
            throws XMLStreamException {
        writer.writeStartElement(name);
        writer.writeCharacters(string);
        writer.writeEndElement();
    }
}
