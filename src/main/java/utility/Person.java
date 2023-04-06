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
public class Person {
     private String name;
    private String id;
    private int age;
    private String type;
    private boolean pass;
    private int amountTimes;

    public Person() {
    }

    public Person(String name, String id, int age, String type, boolean pass, int amountTimes) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.type = type;
        this.pass = pass;
        this.amountTimes = amountTimes;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the pass
     */
    public boolean isPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(boolean pass) {
        this.pass = pass;
    }

    /**
     * @return the amountTimes
     */
    public int getAmountTimes() {
        return amountTimes;
    }

    /**
     * @param amountTimes the amountTimes to set
     */
    public void setAmountTimes(int amountTimes) {
        this.amountTimes = amountTimes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{name=").append(name);
        sb.append(", id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", type=").append(type);
        sb.append(", pass=").append(pass);
        sb.append(", amountTimes=").append(amountTimes);
        sb.append('}');
        return sb.toString();
    }



}
