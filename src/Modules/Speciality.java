package Modules;

public class Speciality {
    private int speciality_id;
    private String speciality;

    public Speciality() {
    }

    public Speciality(int speciality_id, String speciality) {
        this.speciality_id = speciality_id;
        this.speciality = speciality;
    }

    public int getSpeciality_id() {
        return speciality_id;
    }

    public void setSpeciality_id(int speciality_id) {
        this.speciality_id = speciality_id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
