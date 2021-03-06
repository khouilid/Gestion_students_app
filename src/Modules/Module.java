package Modules;

public class Module {

    private int module_id;
    private String module_name;
    private int speciality_id;
    private String speciality;

    public Module() {
    }

    public Module(int module_id, String module_name, int speciality_id, String speciality) {
        this.module_id = module_id;
        this.module_name = module_name;
        this.speciality_id = speciality_id;
        this.speciality = speciality;
    }


    public int getModule_id() {
        return module_id;
    }

    public void setModule_id(int module_id) {
        this.module_id = module_id;
    }

    public int getSpeciality_id() {
        return speciality_id;
    }

    public void setSpeciality_id(int speciality_id) {
        this.speciality_id = speciality_id;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }



}



