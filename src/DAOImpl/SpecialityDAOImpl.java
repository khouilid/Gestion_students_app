package DAOImpl;

import DAO.SpecialityDAO;
import Modules.Speciality;
import Utiles.DBconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class SpecialityDAOImpl extends DBconnection implements SpecialityDAO {
    @Override
    public String create(Speciality speciality) throws SQLException {
        try {
            var sql = "INSERT INTO thespeciality (`Speciality`) VALUES (?);";

            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setString(1, speciality.getSpeciality());
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
            var sql = "DELETE FROM thespeciality WHERE Speciality_id = ? ;";

            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1,id);
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
    public String update(Speciality speciality) throws SQLException {
        try {
            var sql = "UPDATE thespeciality SET `Modules_name`= ? WHERE Speciality_id = ?;";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setString(1, speciality.getSpeciality());
            stmt.setInt(2, speciality.getSpeciality_id() );
            stmt.executeUpdate();
            return "Done!";
        } catch (Exception e) {
            return e.getMessage();
        }
        finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
    }

    @Override
    public ResultSet get_By_id(int id) throws SQLException {
        try {
            Statement stmt = Objects.requireNonNull(connect()).createStatement();
            return stmt.executeQuery("SELECT * FROM thespeciality WHERE  Speciality_id = "+ id +";");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
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
            return stmt.executeQuery("SELECT * FROM thespeciality;");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(connect() != null){
                Objects.requireNonNull(connect()).close();
            }
        }
        return null;
    }
}
