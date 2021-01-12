package DAO;

import Modules.Speciality;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SpecialityDAO {

    String create(Speciality speciality) throws SQLException;

    String delete(int id) throws SQLException;

    String update(Speciality speciality) throws SQLException;

    ResultSet get_By_id(int id) throws SQLException;

    ResultSet getAll() throws SQLException;


}
