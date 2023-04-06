/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static javax.swing.JOptionPane.showMessageDialog;
import utility.Ticket;
import utility.Accounting;
import utility.Souvenir;
import utility.Pass;
import utility.Person;
import utility.Plan;
/**
 *
 * @author SANTIAGO
 */
public class DptSales {
    private Accounting accounting = new Accounting();
    private ArraysControl arraysControl = new ArraysControl();
    
    //verifica si existe el ticket
    public boolean ticketExits (String code){
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }    
        return false;
    }
    
    //si existe el tiquete menor lo retorna
    public Ticket returnTicket (String code) {
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return getArraysControl().getTickets().get(i);
                }
            }
        }
        return null;
    }
    
    //retorna la posicion del tikect
    public int getPositionTickets (String code) {
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (ticketExits(code) && getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return getArraysControl().getTickets().indexOf(returnTicket(code)) ;
                }
            }
        }
        return -1;
    }
    
    //verifica si existe el ticket
    public boolean passExits (String code){
        if (arraysControl.getPasses().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPasses().size(); i++) {
                if (getArraysControl().getPasses().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }    
        return false;
    }
    
    //si existe el tiquete menor lo retorna
    public Pass returnPass (String code) {
        if (arraysControl.getPasses().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPasses().size(); i++) {
                if (getArraysControl().getPasses().get(i).getCode().equals(code)) {
                    return getArraysControl().getPasses().get(i);
                }
            }
        }
        return null;
    }
    
    //retorna la posicion del tikect
    public int getPositionPass (String code) {
        if (arraysControl.getPasses().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPasses().size(); i++) {
                if (passExits(code) && getArraysControl().getPasses().get(i).getCode().equals(code)) {
                    return getArraysControl().getPasses().indexOf(returnPass(code)) ;
                }
            }
        }
        return -1;
    }
    
    public boolean souvenirExits (String code){
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Souvenir returnSouvenir (String code) {
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return getArraysControl().getSouvenirs().get(i);
                }
            }
        }
        return null;
    }
    
    public int getPositionSouvenir (String code) {
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (souvenirExits(code) && getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return getArraysControl().getSouvenirs().indexOf(returnSouvenir(code)) ;
                    }
            }
        }
        return -1;
    }
    
    public boolean personExits (String code){
        if (arraysControl.getPersons().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPersons().size(); i++) {
                if (getArraysControl().getPersons().get(i).getId().equals(code)) {
                    return true;
                }
            }
        }    
        return false;
    }
    
    //si existe el tiquete menor lo retorna
    public Person returnPerson (String id) {
        if (arraysControl.getPersons().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getPersons().get(i).getId().equals(id)) {
                    return getArraysControl().getPersons().get(i);
                }
            }
        }
        return null;
    }
    
    public boolean planExits (String code){
        if (arraysControl.getPlans().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPlans().size(); i++) {
                if (getArraysControl().getPlans().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Plan returnPlan (String code) {
        if (arraysControl.getPlans().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPlans().size(); i++) {
                if (getArraysControl().getPlans().get(i).getCode().equals(code)) {
                    return getArraysControl().getPlans().get(i);
                }
            }
        }
        return null;
    }
    
    public int getPositionPlan (String code) {
        if (arraysControl.getPlans().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getPlans().size(); i++) {
                if (planExits(code) && getArraysControl().getPlans().get(i).getCode().equals(code)) {
                    return getArraysControl().getPlans().indexOf(returnPlan(code)) ;
                    }
            }
        }
        return -1;
    }
    
    public void sellPlan() {
    
    }
    
    public void newTicket(Ticket t) {
        getArraysControl().getTickets().add(t);
    }
    
    public void editTicket (String code, Ticket t) {
        if (ticketExits(code)) {
            Ticket b = returnTicket(code);
            b.setAge_restriction(t.getAge_restriction());
            b.setPrice(t.getPrice());
            showMessageDialog(null, "el tiquete fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al tiquete con ese código");
                }
    }
    
    public void cancelTicket(String code){
        
        if (ticketExits(code)) {
            if (getPositionTickets(code) != -1) {
                getArraysControl().getTickets().remove(getPositionTickets(code));
                showMessageDialog(null, "el tiquete fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no sé encontró el tiquete en la base de datos");
            }
    }
    
     public void newSouvenir(Souvenir s) {
        getArraysControl().getSouvenirs().add(s);
            
    }
    
    public void editSouvenir (String code, Souvenir s) {
        if (souvenirExits(code)) {
           Souvenir b = returnSouvenir(code);
            b.setDescription(s.getDescription());
            b.setPrice(s.getPrice());
            showMessageDialog(null, "el souvenir fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al souvenir con ese código");
                }
    }
    
    public void cancelSouvenir(String code){
        if (souvenirExits(code)) {
            if (getPositionSouvenir(code) != -1) {
                getArraysControl().getSouvenirs().remove(getPositionSouvenir(code));
                showMessageDialog(null, "el souvenir fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no se encontró el souvenir en la base de datos");
        }
    }
    
    public void newPass(Pass p) {
        getArraysControl().getPasses().add(p);
            
    }
    
    public void editPass (String code, Pass p) {
        if (passExits(code)) {
            Pass b = returnPass(code);
            b.setCant_times(p.getCant_times());
            b.setPrice(p.getPrice());
            showMessageDialog(null, "el abono fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al abono con ese código");
                }
    }
    
    public void cancelPass(String code){
        if (passExits(code)) {
            if (getPositionPass(code) != -1) {
                getArraysControl().getPasses().remove(getPositionPass(code));
                showMessageDialog(null, "el abono fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no se encontró el abono en la base de datos");
        }
    }
    
     public void newPlan(Plan p) {
        getArraysControl().getPlans().add(p);
    }
    
    public void editPlan (String code, Plan p) {
        if (planExits(code)) {
            Plan b = returnPlan(code);
            b.setCantPeople(p.getCantPeople());
            b.setCode(p.getCode());
            b.setDays(p.getDays());
            b.setDescription(p.getDescription());
            b.setDuration(p.getDuration());
            b.setHours(p.getHours());
            b.setName(p.getName());
            b.setPrice(p.getPrice());
            b.setPricepass(p.getPricepass());
            b.setSouvenir(p.isSouvenir());
            showMessageDialog(null, "el plan fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe el plan con ese código");
                }
    }
    
    public void cancelPlan(String code){
        if (planExits(code)) {
            if (getPositionPlan(code) != -1) {
                getArraysControl().getPlans().remove(getPositionPlan(code));
                showMessageDialog(null, "el plan fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no sé encontró el plan en la base de datos");
            }
    }
    
    public void sellTicket(double income, int amount){ 
        double currentIncome = accounting.getIncome();
        int currentSold = accounting.getTickets_sold();
        currentIncome = currentIncome + income;
        currentSold = currentSold + amount;
        accounting.setTickets_sold(currentSold);
        accounting.setIncome(currentIncome);
        showMessageDialog(null, "se han vendido correctamente las boletas");
    }

    public void sellSouvenir(double income, int amount){
            int currentSold = accounting.getSouvenirs_sold();
            double currentIncome = accounting.getIncome();
            currentSold = currentSold + amount;
            currentIncome = currentIncome + income;
            accounting.setSouvenirs_sold(currentSold);
            accounting.setIncome(currentIncome);
            showMessageDialog(null, "se han vendido correctamente las souvenir");
    }
    
     public void sellPass(double income, int amount) {
        int currentSold = accounting.getPasses_sold();
        double currentIncome = accounting.getIncome();
        currentSold = currentSold + amount;
        currentIncome = currentIncome + income;
        accounting.setPasses_sold(currentSold);
        accounting.setIncome(currentIncome);
        showMessageDialog(null, "se han vendido correctamente las abonos");
    }
     
    public void sellPlan(double income, int amount) {
        int currentSold = accounting.getPlans_sold();
        double currentIncome = accounting.getIncome();
        currentSold = currentSold + amount;
        currentIncome = currentIncome + income;
        accounting.setPlans_sold(currentSold);
        accounting.setIncome(currentIncome);
        showMessageDialog(null, "se han vendido correctamente las abonos");
    }
    /**
     * @return the arraysControl
     */
    public ArraysControl getArraysControl() {
        return arraysControl;
    }
    
    
    
}
