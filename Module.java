/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module_app;

import java.io.Serializable;

/**
 *
 * @author Josh
 */
public class Module implements Serializable {
    private String module_Name;
    private String module_Code;
    private int noOfStudents;

    public Module(String module_Name, String module_Code, int noOfStudents) {
        this.module_Name = module_Name;
        this.module_Code = module_Code;
        this.noOfStudents = noOfStudents;
    }

    public String getModule_Name() {
        return module_Name;
    }

    public String getModule_Code() {
        return module_Code;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setModule_Name(String module_Name) {
        this.module_Name = module_Name;
    }

    public void setModule_Code(String module_Code) {
        this.module_Code = module_Code;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    
}
