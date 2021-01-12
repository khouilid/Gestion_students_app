package Modules;

public class Student {
    private static int id;
    private static String name;
    private static String phone;
    private static String email;
    private static String speciality;

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public Student() {
    }

    public Student(int id, String name, String phone, String email, String speciality) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.speciality = speciality;
    }


}

