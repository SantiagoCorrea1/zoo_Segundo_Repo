/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;
import utility.Animal;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SANTIAGO
 */
public class DptLogistic {
    
    ArraysControl arraysControl =  new ArraysControl();
    
    //verificación existe en animal menor
    public boolean minorExists(String code){
        if(arraysControl.getMinorAnimals().isEmpty() == false){
            for (int i = 0; i < arraysControl.getMinorAnimals().size(); i++) {
                if (arraysControl.getMinorAnimals().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public MinorAnimal returnMinors(String code) {
        if(arraysControl.getMinorAnimals().isEmpty() == false)
            for (int i = 0; i < arraysControl.getMinorAnimals().size(); i++) {
                if (arraysControl.getMinorAnimals().get(i).getCode().equals(code)) {
                    return arraysControl.getMinorAnimals().get(i);
                }
        }
        return null;
    }
    
    //métdo para saber si existe el animal dado un código
    public boolean domesticExists(String code){
        if(arraysControl.getDomesticAnimals().isEmpty() == false){
            for (int i = 0; i < arraysControl.getDomesticAnimals().size(); i++) {
                if (arraysControl.getDomesticAnimals().get(i).getCode().equals(code)) {
                return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal domestico lo retorna
    public DomesticAnimal returnDomestic(String code) {
        if(arraysControl.getDomesticAnimals().isEmpty() == false){
            for (int i = 0; i < arraysControl.getDomesticAnimals().size(); i++) {
                if (arraysControl.getDomesticAnimals().get(i).getCode().equals(code)) {
                return arraysControl.getDomesticAnimals().get(i);
                }
            }
        }
        return null;
    }
    
    //verificaión existe animal base
    public boolean animalExits(String code){
        for (int i = 0; i < arraysControl.getAnimals().size(); i++) {
            if (arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Animal returnAnimal(String code) {
        for (int i = 0; i < arraysControl.getAnimals().size(); i++) {
            if (arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return arraysControl.getAnimals().get(i);
            }
        }
        return null;
    }
    
    //método para verificar si existe el animal menor de ese código
    public boolean savageExists(String code){
        if(arraysControl.getDomesticAnimals().isEmpty() == false){
            for (int i = 0; i < arraysControl.getSavageAnimals().size(); i++) {
                if (arraysControl.getSavageAnimals().get(i).getCode().equals(code)) {
                return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public SavageAnimal returnSavage(String code) {
        for (int i = 0; i < arraysControl.getSavageAnimals().size(); i++) {
            if (arraysControl.getSavageAnimals().get(i).getCode().equals(code)) {
            return arraysControl.getSavageAnimals().get(i);
            }
        }
        showMessageDialog(null, "la lista es vacía");
        return null;
    }
    
    //retorna la posición de un animal en su arreglo de tipo
    public int getPosition (String code, String type){
        
        switch(type) {
            case "menor": 
                    if (minorExists(code)) {
                        return arraysControl.getMinorAnimals().indexOf(returnMinors(code));
                }
                break;
            case "domestico":    
                    if (domesticExists(code)) {
                        return arraysControl.getDomesticAnimals().indexOf(returnDomestic(code)); 
                }
                break;
            case "salvaje":
                    if (savageExists(code)) {
                        return arraysControl.getSavageAnimals().indexOf(returnSavage(code)); 
                }
                break;
            }
        return -1;
        }
    
    //retorna la posición de un animal en el arreglo general
    public int getPositionGeneral (String code) {
        for (int i = 0; i < arraysControl.getAnimals().size(); i++) {
            if (animalExits(code) && arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return arraysControl.getAnimals().indexOf(returnAnimal(code)) ;
                }
        }
        return -1;
    }
    
    public ArraysControl getArraysControl() {
        return arraysControl;
    }

    public void setArraysControl(ArraysControl arraysControl) {
        this.arraysControl = arraysControl;
    }
    
     //método agregar animales menores
    public void addMinorAnimals (MinorAnimal a) {
            Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
            arraysControl.getAnimals().add(animalN);
            arraysControl.getMinorAnimals().add(a);
   
    }
    
     //método agregar animales domesticos
    public void addDomesticAnimals(DomesticAnimal a) {
            Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
            arraysControl.getAnimals().add(animalN);
            arraysControl.getDomesticAnimals().add(a);
    }
    
     //método agregar animales salvajes
    public void addSavageAnimals(SavageAnimal a){
            Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
            arraysControl.getAnimals().add(animalN);
            arraysControl.getSavageAnimals().add(a);
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editMinorAnimals (String code, MinorAnimal a) {
        if (minorExists(code)) {
            MinorAnimal b = returnMinors(code);
            b.setName(a.getName());
            b.setUse(a.getUse());
            b.setVulgarName(a.getVulgarName());
            b.setWeigth(a.getWeigth());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editDomesticAnimals (String code, DomesticAnimal a) {
        if (domesticExists(code)) {
            DomesticAnimal b = returnDomestic(code);           
            b.setName(a.getName());     
            b.setWeigth(a.getWeigth());
            b.setKindnessLevel(a.getKindnessLevel());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    
    // al animal salvaje retornado le setea los datos que se pueden cambiar, algunos no tiene sentido permitir cambios
    public void editSavage (String code, SavageAnimal a) {
        if (savageExists(code)) {
            SavageAnimal b = returnSavage(code);
            b.setName(a.getName());
            b.setWeigth(a.getWeigth());
            b.setDangerLevel(a.getDangerLevel());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    //elimina el animal del arreglo tipo y del arreglo general
    public void deleteAnimal(String code, String type) {  
            if (getPosition(code, type) != -1 && getPositionGeneral(code) != -1) {
                switch (type) {
                    case "menor":    
                        arraysControl.getMinorAnimals().remove(getPosition(code, type));
                        arraysControl.getAnimals().remove(getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                        break;
                    case "domestico":
                        arraysControl.getDomesticAnimals().remove(getPosition(code, type));
                        arraysControl.getAnimals().remove(getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                        break;
                    case "salvaje":
                        arraysControl.getSavageAnimals().remove(getPosition(code, type));
                        arraysControl.getAnimals().remove(getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                        break;
                }
            } else{
                showMessageDialog(null, "no se encontró el animal");
                        }
    }
    
    //interfaces de animales y métodos de actividades
    //pdf
    //
}
