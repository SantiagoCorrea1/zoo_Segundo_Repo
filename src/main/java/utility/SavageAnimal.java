/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author SANTIAGO
 */
public class SavageAnimal extends Animal{
    private String dangerLevel;
    private String habitat;
    private String species;

    public SavageAnimal() {
    }

    public SavageAnimal(String dangerLevel, String habitat, String species, String code, String name, String weigth, String type) {
        super(code, name, weigth, type);
        this.dangerLevel = dangerLevel;
        this.habitat = habitat;
        this.species = species;
    }

    /**
     * @return the dangerLevel
     */
    public String getDangerLevel() {
        return dangerLevel;
    }

    /**
     * @param dangerLevel the dangerLevel to set
     */
    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SavageAnimal{dangerLevel=").append(dangerLevel);
        sb.append(", habitat=").append(habitat);
        sb.append(", species=").append(species);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
