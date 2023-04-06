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
public class Pass {
    private double price;
    private String code;
    private int cant_times;

    public Pass() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pass{price=").append(price);
        sb.append(", code=").append(code);
        sb.append(", cant_times=").append(cant_times);
        sb.append('}');
        return sb.toString();
    }

    public Pass(double price, String code, int cant_times) {
        this.price = price;
        this.code = code;
        this.cant_times = cant_times;
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
     * @return the cant_times
     */
    public int getCant_times() {
        return cant_times;
    }

    /**
     * @param cant_times the cant_times to set
     */
    public void setCant_times(int cant_times) {
        this.cant_times = cant_times;
    }
    
    
}
