package controller;



/**
 * Created by asus on 6/6/2020.
 */

import javax.faces.bean.*;
/*import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;*/

@ManagedBean(name = "code")
@RequestScoped
public class First {

    private String name="meysam";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
    public String goToSecondPage(){
        System.out.println(name);
        return "second.xhtml";
    }
}
