/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
//import utility.Animal;
import java.util.ArrayList;
import utility.Animal;
import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;
import utility.Plan;
import utility.Souvenir;
import utility.Pass;
import utility.Ticket;
import utility.Person;


/**
 *
 * @author SANTIAGO
 */
public class ArraysControl {
    
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<DomesticAnimal> domesticAnimals = new ArrayList<>();
    private ArrayList<MinorAnimal> minorAnimals = new ArrayList<>();
    private ArrayList<SavageAnimal> savageAnimals = new ArrayList<>();
    private ArrayList<Plan> plans = new ArrayList<>();
    private ArrayList<Souvenir> souvenirs = new ArrayList<>();
    private ArrayList<Pass> passes = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();
           
    /**
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @return the domesticAnimals
     */
    public ArrayList<DomesticAnimal> getDomesticAnimals() {
        return domesticAnimals;
    }

    /**
     * @return the minorAnimals
     */
    public ArrayList<MinorAnimal> getMinorAnimals() {
        return minorAnimals;
    }

    /**
     * @return the savageAnimals
     */
    public ArrayList<SavageAnimal> getSavageAnimals() {
        return savageAnimals;
    }

    /**
     * @return the plans
     */
    public ArrayList<Plan> getPlans() {
        return plans;
    }

    /**
     * @return the souvenirs
     */
    public ArrayList<Souvenir> getSouvenirs() {
        return souvenirs;
    }

    /**
     * @return the passes
     */
    public ArrayList<Pass> getPasses() {
        return passes;
    }

    /**
     * @return the tickets
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @return the persons
     */
    public ArrayList<Person> getPersons() {
        return persons;
    }

    //
}
