package com.meltemi.onlineExam;

import com.meltemi.onlineExam.domain.Exam;
import com.meltemi.onlineExam.domain.QuestionPaper;
import com.meltemi.onlineExam.domain.RecordExam;
import com.meltemi.onlineExam.mapper.PaperMapper;
import com.meltemi.onlineExam.mapper.QuestionMapper;
import com.meltemi.onlineExam.service.ExamService;
import com.meltemi.onlineExam.service.RecordService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@MapperScan("com.meltemi.onlineExam.mapper")
@SpringBootTest
class QuizApplicationTests {
    @Autowired
    private PaperMapper paperMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private RecordService recordService;
    @Autowired
    private ExamService examService;

    @Test
    void contextLoads() {
    }
    @Test
    public void test1(){
        List<QuestionPaper> questionPapers = paperMapper.paperQueryALlQuestionById(1);
        System.out.println(questionPapers);
    }

    @Test
    public void test2(){
//        List<QuestionCount> questionCounts = questionMapper.queryNumOfQuestionType();
        List<Map> maps = questionMapper.queryNumOfQuestionType();

//        Map<Integer, String> integerStringMap = questionMapper.queryNumOfQuestionType();
//        System.out.println(integerStringMap);
        System.out.println(maps);
    }
    @Test
    public void test3(){
        System.out.println("+++++++++++++++++++++++++++++++++");
                 System.out.println("List转字符串");
                 List<String> list1 = new ArrayList<String>();
                list1.add("1");
                 list1.add("2");
                list1.add("3");
                 String ss = String.join(",", list1);
                 System.out.println(ss);
                 System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println("字符串转List");
                 List<String> listString = Arrays.asList(ss.split(","));
                 for (String string : listString) {
                         System.out.println(string);
                    }
                System.out.println("+++++++++++++++++++++++++++++++++");

    }
    @Test
    public void test4(){
        RecordExam recordExam=new RecordExam();
        recordExam.setClaId(1);
        recordExam.setExaName("java综合测试");
        System.out.println(recordExam);
        int i = recordService.queryAllScore(recordExam);
        System.out.println(i);
    }
    @Test
    public void test5(){
        System.out.println(recordService.queryStudentAndPaper(1, 16).size());
    }
    @Test
    public void test6(){
        List list = new ArrayList();
        list.add("Meltemi");
        list.add("Bob");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(0).hashCode());
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
    @Test
    public void test7() {
        List<Exam> all = examService.getAllById(2);
//        Exam exam = new Exam();
        System.out.println(all);

    }

}
