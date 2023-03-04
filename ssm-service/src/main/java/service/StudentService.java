package service;

import mappers.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Student;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    private StudentMapper studentMapper;

    @Resource
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public StudentService() {
    }

    @Transactional
    public List<Student> selectAll(){
        return studentMapper.selectAll();
    }


}
