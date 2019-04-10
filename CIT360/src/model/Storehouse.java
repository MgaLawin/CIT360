package model;

import java.io.Serializable;
import control.GameControl;

/**
 *
 * @author Jeremy
 */
public class Storehouse implements Serializable {

    private Author[] authors;
    private Animal[] animals;
    private InventoryItem[] tools;
    private Provision[] provisions;

    public Storehouse() {
        // empty constructor for Javabeans
    }
 public Storehouse( Animal[] animals, InventoryItem[] tools, Provision[] provisions, Author[] author){
     setAuthors(author);
     setAnimals(animals);  
     setTools(tools);
     setProvisions(provisions);
          
    }
   public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] author) {
        this.authors = author;
    }
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public InventoryItem[] getTools() {
        return tools;
    }

    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }

    public Provision[] getProvisions() {
        return provisions;
    }

    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }

    @Override
    public String toString() {
        return "Storehouse{"
            + "animals" + animals
            + "tools" + tools
            + "provisions" + provisions
            + "}";
    }

}
