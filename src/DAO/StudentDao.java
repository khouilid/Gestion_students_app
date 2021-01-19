package DAO;

import Modules.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface StudentDao {

        ResultSet get_By_id(int id) throws SQLException;


        ResultSet getAll() throws SQLException;

//ajouter les models student
        String set(Student Student) throws SQLException;

//modifier les models student
        String update(Student Student) throws SQLException;
        
//supprimer les models student
        String delete(Student Student) throws SQLException;
    }


