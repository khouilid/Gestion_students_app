package DAOImpl;

//import DAO.AdminDao;
import DAO.StudentDao;
import Utiles.DBconnection;
import Modules.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public abstract class StudentDaoImp extends DBconnection implements StudentDao {


    @Override
    public ResultSet get_By_id(int id) throws SQLException {
        try {
            String sql = "SELECT * FROM students WHERE  Student_id = ?;";
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
            return stmt.executeQuery("SELECT * FROM students;");
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
    public String set(Student Student) throws SQLException {
        try {
            String sql = "INSERT INTO students (`Student_id`, `First_name`,`Last_name`,`phone`,`Email`,`speciality_id`) VALUES (?,?);";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1, Student.getId());
            stmt.setString(2, Student.getName());
            stmt.setString(3, Student.getPhone());
            stmt.setString(4, Student.getEmail());
            stmt.setString(5, Student.getSpeciality());
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

    public String update(Student Student) throws SQLException {

        try {
            String sql = "UPDATE  students SET (`Student_id`, `First_name`,`Last_name`,`phone`,`Email`,`speciality_id`) VALUES (?,?);";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1, Student.getId());
            stmt.setString(2, Student.getName());
            stmt.setString(3, Student.getPhone());
            stmt.setString(4, Student.getEmail());
            stmt.setString(5, Student.getSpeciality());
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
    public String delete(Student Student) throws SQLException {
        try {
            String sql = "DELETE FROM students  WHERE (`Student_id`, `First_name`,`Last_name`,`phone`,`Email`,`speciality_id`) = ? ;";
            PreparedStatement stmt = Objects.requireNonNull(connect()).prepareStatement(sql);
            stmt.setInt(1, Student.getId());
            stmt.setString(2, Student.getName());
            stmt.setString(3, Student.getPhone());
            stmt.setString(4, Student.getEmail());
            stmt.setString(5, Student.getSpeciality());
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





