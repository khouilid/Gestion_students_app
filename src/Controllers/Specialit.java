package Controllers;

import DAO.SpecialityDAO;
import DAOImpl.SpecialityDAOImpl;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import Modules.*;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class Specialit {

    public TextField speciality;
    public AnchorPane window;

    public void add__speciality(MouseEvent mouseEvent) throws SQLException {
         if(!speciality.getText().equals("")){
            try {
                SpecialityDAO addOne = new SpecialityDAOImpl();
                Speciality speciality1 = new Speciality();
                speciality1.setSpeciality(speciality.getText());
                System.out.println(addOne.create(speciality1));

            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }

         }



    }


}
