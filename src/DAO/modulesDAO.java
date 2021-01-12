package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import Modules.Module;

public interface modulesDAO {
    ResultSet get_By_id(int id) throws SQLException;

    ResultSet getAll() throws SQLException;

    String set(Module module) throws SQLException;

    String update(Module module) throws SQLException;

    String delete(int id) throws SQLException;
}
