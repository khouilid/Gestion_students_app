package DAOImpl;

import DAO.modulesDAO;
import Modules.Module;
import Utiles.DBconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class ModuleDAOImpl extends DBconnection implements modulesDAO {
    @Override
    public ResultSet get_By_id(int id) throws SQLException {
        try {
            var sql = "SELECT * FROM modules WHERE  Specialty_id = ?;";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1,id);
            return stmt.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
        return null;
    }

    @Override
    public ResultSet getAll() throws SQLException {
        try {
            Statement stmt = Objects.requireNonNull(connect()).createStatement();
            return stmt.executeQuery("SELECT * FROM modules;");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
        return null;
    }

    @Override
    public String set(Module module) throws SQLException {
        try {
            var sql = "INSERT INTO modules (`Modules_name`, `Specialty_id`) VALUES (?,?);";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setString(1, module.getModule_name());
            stmt.setInt(2, module.getSpeciality_id());
            stmt.executeUpdate();
            return "Done!";
        } catch (Exception e) {
            return e.getMessage();
        }finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
    }

    @Override
    public String update(Module module) throws SQLException {
        try {
            var sql = "UPDATE modules SET `Modules_name`= ? WHERE Modules_id = ?";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setString(1, module.getModule_name());
            stmt.setInt(2, module.getModule_id());
            stmt.executeUpdate();
            return "Done!";
        } catch (Exception e) {
            return e.getMessage();
        }finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
    }

    @Override
    public String delete(int id) throws SQLException {
        try {
            var sql = "DELETE FROM modules WHERE Modules_id = ? ;";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return "Done!";
        } catch (Exception e) {
            return e.getMessage();
        }finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
    }
}
