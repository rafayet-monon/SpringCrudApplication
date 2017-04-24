package com.rashed.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.sql.DataSource;
import com.rashed.dao.StudentDAO;
import com.rashed.model.Student;

public class StudentDaoImp implements StudentDAO {

    private DataSource ds;

    public void setDs(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public int save(Student st) throws Exception {
        Connection con = ds.getConnection();
        PreparedStatement ps = con.prepareStatement("insert into spring_tbl_student values(?,?,?,?)");
        ps.setInt(1, st.getId());
        ps.setString(2, st.getName());
        ps.setString(3, st.getEmail());
        ps.setString(4, st.getAddress());
        int i = ps.executeUpdate();
        con.close();
        return i;

    }

    @Override
    public boolean update(Student st) throws Exception {
        Connection con = ds.getConnection();
        PreparedStatement ps = con.prepareStatement("update spring_tbl_student set name=?,email=?,address=? where id=?");
        ps.setString(1, st.getName());
        ps.setString(2, st.getEmail());
        ps.setString(3, st.getAddress());
        ps.setInt(4, st.getId());

        int i = ps.executeUpdate();

        con.close();
        return true;
    }

    @Override
    public boolean delete(Student st) throws Exception {
        Connection con = ds.getConnection();

        con.close();
        return false;
    }

    @Override
    public Student findById(int studentId) throws Exception {
        Connection con = ds.getConnection();

        con.close();
        return null;
    }

    @Override
    public List<Student> findByName(String name) throws Exception {
        Connection con = ds.getConnection();

        con.close();
        return null;
    }

    @Override
    public Student findByEmail(String email) throws Exception {
        Connection con = ds.getConnection();

        con.close();
        return null;
    }

    @Override
    public List<Student> findAll() throws Exception {
        Connection con = ds.getConnection();

        con.close();
        return null;
    }

}
