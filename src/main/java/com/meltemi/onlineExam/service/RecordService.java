package com.meltemi.onlineExam.service;

import com.meltemi.onlineExam.domain.*;

import java.util.List;

public interface RecordService {
    //增加记录
    void addRecord(Record record);
    //查询记录
    List<Record> queryAll();
    //删除
    void deleteById(Integer id);
    //通过记录id查询对应试卷
    List<Record> queryAllExamById(Integer id);
    //查询记录通过id
    Integer queryByRecordId(Integer id);
    //查询答案
    String queryAnsByRecordId(Integer id);
    //查询分数排名
    List<Record> queryRankScoreRecord();
    //查询正确率排名
    List<Record> queryRankAccRecord();
    //查询所有考试名称
    List<Record> queryAllExam();
    //根据考试名查询所有班级
    List<Classe> queryAllClass(String exaName);
    //查询对应学是否已经考过试
    List<Student> queryStudentAndPaper(Integer studentId, Integer paperId);
    //查询对应班级所有考试人数
    int queryAllScore(RecordExam recordExam);
    //查询对应班级所有及格人数
    int queryAccScore(RecordExam recordExam);
    //添加每张试卷总分记录
    void AddToScore(Toscore toscore);
    //总分记录是否存在
    int queryBooleanToscore(Integer paperId);
    //查询paperid对应总分
    int queryToscore(int paperId);

    //查询对应学生的paperID
    List<Record> queryPaperId(int studentId);
}
