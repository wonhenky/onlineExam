package com.meltemi.onlineExam.mapper;

import com.meltemi.onlineExam.domain.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecordMapper {
    void addRecord(Record record);

    List<Record> queryAll();

    @Delete("delete from record where record_id=#{id}")
    void deleteById(Integer id);

    List<Record> queryAllExamById(Integer id);

    @Select("select paper_id from record where record_id=#{id}")
    Integer queryByRecordId(Integer id);

    @Select("select record_answer from record where record_id=#{id}")
    String queryAnsByRecordId(Integer id);

    List<Record> queryRankScoreRecord();

    List<Record> queryRankAccRecord();

    List<Record> queryAllExam();

    List<Classe> queryAllClass(String exaName);

    int queryAllScore(RecordExam recordExam);

    int queryAccScore(RecordExam recordExam);

    void AddToScore(Toscore toscore);

    int queryBooleanToscore(Integer paperId);

    int queryToscore(int paperId);

    List<Student> queryStudentAndPaper(Integer studentId, Integer paperId);

    List<Record> queryPaperId(int studentId);
}
