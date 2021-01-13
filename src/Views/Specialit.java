package Views;

import DAO.SpecialityDAO;
import DAOImpl.SpecialityDAOImpl;
import Modules.Speciality;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Specialit extends Application {

    public TextField speciality;
    public AnchorPane window;
    public Button btn;
    public Button addSpecial;
    public Stage stage = new Stage();


    public void add__speciality(MouseEvent mouseEvent) throws SQLException {

            if (!speciality.getText().equals("")) {
                try {
                    SpecialityDAO addOne = new SpecialityDAOImpl();
                    Speciality speciality1 = new Speciality();
                    speciality1.setSpeciality(speciality.getText());
                    System.out.println(addOne.create(speciality1));
                    this.stage.close();

                } catch (SQLException throwables) {
                    System.out.println(throwables.getMessage());
                }

            }

    }
    public void getspeWindow(MouseEvent mouseEvent) {

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("specialiste.fxml"));

                stage.setTitle("Ajouté une specialité");
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
