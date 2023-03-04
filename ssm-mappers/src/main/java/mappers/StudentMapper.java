package mappers;

import org.apache.ibatis.annotations.Mapper;
import pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> selectAll();

}
