package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Student;

@Controller
public class StudentController {


    @RequestMapping("/show1")
    @ResponseBody
    public Student show1(){
        Student stu=new Student(100,"xxx",20,"男","2000-9-9");
        return stu;
    }




}
