//package Views;
//
//import DAO.SpecialityDAO;
//import DAOImpl.SpecialityDAOImpl;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.fxml.Initializable;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.input.MouseEvent;
//import Modules.Speciality;
//
//import java.net.URL;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ResourceBundle;
//
//public class Modules implements Initializable {
//    public ComboBox comboBox;
//
//    public Modules() throws SQLException {
//        ObservableList<Speciality> comboString = FXCollections.observableArrayList();
//        SpecialityDAO dataset = new SpecialityDAOImpl();
//        ResultSet rs = dataset.getAll();
//        while(rs.next()){
//            Speciality s = new Speciality(rs.getInt("Speciality_id"), rs.getString("Speciality"));
//            comboString.add(s);
//        }
//        comboString.setAll(comboString);
////        comboString.setCellValueFactory(new PropertyValueFactory<Speciality, String>("nom"));
//
//        comboBox.setItems(comboString);
//
//
//    }
//
//    public void add_modules(MouseEvent mouseEvent) throws SQLException {
//
//
//    }
//
//
//
//    public ObservableList<Speciality> getSpecialiteList() throws SQLException {
//        ObservableList<Speciality> specialiteList = FXCollections.observableArrayList();
//        SpecialityDAO dataset = new SpecialityDAOImpl();
//        ResultSet rs = dataset.getAll();
//
//        try{
//
//            while(rs.next()){
//                Speciality s = new Speciality(rs.getInt("Speciality_id"), rs.getString("Speciality"));
//
//                specialiteList.add(s);
//            }
//
//            colCodeS.setCellValueFactory(new PropertyValueFactory<Speciality, Integer>("id"));
//            colNomeS.setCellValueFactory(new PropertyValueFactory<Speciality, String>("nom"));
//
//            comboBox.setItems(list);
//
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return specialiteList;
//    }
//
//    public void viewSpecialite(){
//        ObservableList<Speciality> list = getSpecialiteList();
//
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        viewSpecialite();
//    }
//}
