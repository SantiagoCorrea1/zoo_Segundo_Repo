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
public class Ticket {
    private double price;
    private String code;
    private int age_restriction;

    public Ticket(double price, String code, int age_restriction) {
        this.price = price;
        this.code = code;
        this.age_restriction = age_restriction;
    }

    public Ticket() {
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * @return the age_restriction
     */
    public int getAge_restriction() {
        return age_restriction;
    }

    /**
     * @param age_restriction the age_restriction to set
     */
    public void setAge_restriction(int age_restriction) {
        this.age_restriction = age_restriction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket{price=").append(price);
        sb.append(", code=").append(code);
        sb.append(", age_restriction=").append(age_restriction);
        sb.append('}');
        return sb.toString();
    }
    
    
}
