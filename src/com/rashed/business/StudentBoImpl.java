package com.rashed.business;

import com.rashed.dao.StudentDAO;
import com.rashed.model.Student;

public class StudentBoImpl implements StudentBo {

    private StudentDAO dao;

    public void setDao(StudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public int createStudent(Student st) throws Exception {

        return dao.save(st);
    }

    @Override
    public boolean updateStudent(Student st) throws Exception {

        return dao.update(st);
    }

    @Override
    public boolean deleteStudent(Student st) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

}
