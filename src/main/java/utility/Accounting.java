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
public class Accounting {
    private int tickets_sold;
    private int passes_sold;
    private int souvenirs_sold;
    private int plans_sold;
    private double income;

    public Accounting() {
    }

    public Accounting(int tickets_sold, int passes_sold, int souvenirs_sold, int plans_sold, double income) {
        this.tickets_sold = tickets_sold;
        this.passes_sold = passes_sold;
        this.souvenirs_sold = souvenirs_sold;
        this.plans_sold = plans_sold;
        this.income = income;
    }

    /**
     * @return the tickets_sold
     */
    public int getTickets_sold() {
        return tickets_sold;
    }

    /**
     * @param tickets_sold the tickets_sold to set
     */
    public void setTickets_sold(int tickets_sold) {
        this.tickets_sold = tickets_sold;
    }

    /**
     * @return the passes_sold
     */
    public int getPasses_sold() {
        return passes_sold;
    }

    /**
     * @param passes_sold the passes_sold to set
     */
    public void setPasses_sold(int passes_sold) {
        this.passes_sold = passes_sold;
    }

    /**
     * @return the souvenirs_sold
     */
    public int getSouvenirs_sold() {
        return souvenirs_sold;
    }

    /**
     * @param souvenirs_sold the souvenirs_sold to set
     */
    public void setSouvenirs_sold(int souvenirs_sold) {
        this.souvenirs_sold = souvenirs_sold;
    }

    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * @return the plans_sold
     */
    public int getPlans_sold() {
        return plans_sold;
    }

    /**
     * @param plans_sold the plans_sold to set
     */
    public void setPlans_sold(int plans_sold) {
        this.plans_sold = plans_sold;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Accounting{tickets_sold=").append(tickets_sold);
        sb.append(", passes_sold=").append(passes_sold);
        sb.append(", souvenirs_sold=").append(souvenirs_sold);
        sb.append(", plans_sold=").append(plans_sold);
        sb.append(", income=").append(income);
        sb.append('}');
        return sb.toString();
    }
    
}
