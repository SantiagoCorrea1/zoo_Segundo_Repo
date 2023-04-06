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
public class Animal {
    private String code;
    private String name;
    private String weigth;
    private String type;

    public Animal() {
    }

    public Animal(String code, String name, String weigth, String type) {
        this.code = code;
        this.name = name;
        this.weigth = weigth;
        this.type = type;
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
     * @return the weigth
     */
    public String getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(String weigth) {
        this.weigth = weigth;
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

    
    
    
    
    
}
