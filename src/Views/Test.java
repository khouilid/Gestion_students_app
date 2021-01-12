package Views;


import DAO.modulesDAO;
import DAOImpl.ModuleDAOImpl;
import Modules.Module;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {


    // SpecialityDAO speciality = new SpecialityDAOImpl();
    // Speciality specialit = new Speciality();

        modulesDAO mode = new ModuleDAOImpl();
        Module module = new Module();
//        module.setModule_id(7);
//        module.setModule_name("200");

//        module.setModule_name("");
//        module.setSpeciality_id(2);
//        System.out.println(mode.update(module));

//        specialit.setSpeciality_id(2);
//        specialit.setSpeciality("full");
//        System.out.println(speciality.delete(7));
    }
}
