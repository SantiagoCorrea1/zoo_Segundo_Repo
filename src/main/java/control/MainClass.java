/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author SANTIAGO
 */
public class MainClass {
    
    private ArraysControl arraysControl = new ArraysControl();
    DptSales dptSales = new DptSales();
    DptLogistic dptLogistic =  new DptLogistic();
    DptAccounting dptAccounting = new DptAccounting();

    public DptSales getDptSales() {
        return dptSales;
    }

    public DptLogistic getDptLogistic() {
        return dptLogistic;
    }

    public DptAccounting getDptAccounting() {
        return dptAccounting;
    }

    /**
     * @return the arraysControl
     */
    public ArraysControl getArraysControl() {
        return arraysControl;
    }
    
    
}
