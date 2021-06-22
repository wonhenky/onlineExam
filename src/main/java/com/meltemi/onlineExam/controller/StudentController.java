package com.meltemi.onlineExam.controller;

import com.meltemi.onlineExam.domain.Classe;
import com.meltemi.onlineExam.domain.Student;
import com.meltemi.onlineExam.mapper.ClasseMapper;
import com.meltemi.onlineExam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private ClasseMapper classeMapper;
    @Autowired
    private StudentService studentService;
//查看所有学生
    @RequestMapping("/getAllStudent")
    public String getAllStudent(Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("students",students);
        return "student/studentList";
    }

//修改编辑功能,先获取该id得学生信息
    @RequestMapping("/{id}")
    public String updateStudent(@PathVariable("id") Integer id,Model model){
        Student student=studentService.getStudentById(id);
        List<Classe> classes = classeMapper.queryAll();
        model.addAttribute("classes",classes);
        model.addAttribute("student",student);
        return "student/studentEdit";
    }
    //修改编辑功能,先获取该id得学生信息
    @RequestMapping("/simple/{id}")
    public String simpleUpdateStudent(@PathVariable("id") Integer id,Model model){
        Student student=studentService.getStudentById(id);
        List<Classe> classes = classeMapper.queryAll();
        model.addAttribute("classes",classes);
        model.addAttribute("student",student);
        return "student/studentSimpleEdit";
    }
//更改学生信息
    @RequestMapping("/editStudent")
    public String EditStudent(Student student){
        studentService.EditStudent(student);
        return "redirect:/student/getAllStudent";
    }
    //学生更改学生信息
    @RequestMapping("/simpleEditStudent")
    public String simpleEditStudent(Student student){
        studentService.EditStudent(student);
        return "redirect:/";
    }
//删除学生
    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        studentService.deleteById(id);
        return "redirect:/student/getAllStudent";
    }
}
