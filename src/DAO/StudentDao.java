package DAO;

import Modules.Student;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface StudentDao {

        ResultSet get_By_id(int id) throws SQLException;

        ResultSet getAll() throws SQLException;

        String set(Student Student) throws SQLException;

        String update(Student Student) throws SQLException;

        String delete(Student Student) throws SQLException;
    }


