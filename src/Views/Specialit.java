package Views;

import DAO.SpecialityDAO;
import DAOImpl.ModuleDAOImpl;
import DAOImpl.SpecialityDAOImpl;
import Modules.Module;
import Modules.Speciality;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Specialit{

    public TextField speciality;
    public AnchorPane window;
    public Button btn;
    public Button addSpecial;
    public Stage stage = new Stage();
  

    public TableColumn<Speciality,Integer> s_id;
    public TableColumn<Speciality,String> s_name;

    public TableView<Speciality> tableView;
    public Button addModules;

    private ObservableList<Object> data;

    public Specialit() throws SQLException {





    }


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
    public void getspeWindow(MouseEvent mouseEvent) throws SQLException {


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



    public void getModeWindow(MouseEvent mouseEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Module.fxml"));
            stage.setTitle("Ajouté une specialité");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }



    public void reaload(ActionEvent actionEvent) throws SQLException {
        displaySpa();
        displaymod();

    }




    private void displaySpa() throws SQLException {
        ObservableList<Speciality> specialiteList = FXCollections.observableArrayList();
        SpecialityDAO dataset = new SpecialityDAOImpl();
        ResultSet rs = dataset.getAll();

        try{

            while(rs.next()){
                Speciality s = new Speciality(rs.getInt("Speciality_id"), rs.getString("Speciality"));

                specialiteList.add(s);
            }

            s_id.setCellValueFactory(new PropertyValueFactory<>("Speciality_id"));
            s_name.setCellValueFactory(new PropertyValueFactory<>("Speciality"));

            tableView.setItems(specialiteList);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void displaymod() throws SQLException {
        ObservableList<Module> modules = FXCollections.observableArrayList();
        ModuleDAOImpl dataset = new ModuleDAOImpl();
        ResultSet rs = dataset.getAll();


        try{

            while(rs.next()){
                SpecialityDAO specialit = new SpecialityDAOImpl();
                String s =  specialit.get_By_id(rs.getInt("Specialty_id")).getString("Speciality");
                System.out.println(s);
//                Module m = new Module();

//                modules.add(m);
            }

            s_id.setCellValueFactory(new PropertyValueFactory<>("Speciality_id"));
            s_name.setCellValueFactory(new PropertyValueFactory<>("Speciality"));

//            table.setItems(modules);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
