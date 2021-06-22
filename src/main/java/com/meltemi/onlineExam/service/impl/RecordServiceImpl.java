package com.meltemi.onlineExam.service.impl;

import com.meltemi.onlineExam.domain.*;
import com.meltemi.onlineExam.mapper.RecordMapper;
import com.meltemi.onlineExam.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    public void addRecord(Record record) {
        recordMapper.addRecord(record);
    }

    @Override
    public List<Record> queryAll() {
        return recordMapper.queryAll();
    }

    @Override
    public void deleteById(Integer id) {
        recordMapper.deleteById(id);
    }

    @Override
    public List<Record> queryAllExamById(Integer id) {
        return recordMapper.queryAllExamById(id);
    }

    @Override
    public Integer queryByRecordId(Integer id) {
        return recordMapper.queryByRecordId(id);
    }

    @Override
    public String queryAnsByRecordId(Integer id) {
        return recordMapper.queryAnsByRecordId(id);
    }

    @Override
    public List<Record> queryRankScoreRecord() {
        return recordMapper.queryRankScoreRecord();
    }

    @Override
    public List<Record> queryRankAccRecord() {
        return recordMapper.queryRankAccRecord();
    }

    @Override
    public List<Record> queryAllExam() {
        return recordMapper.queryAllExam();
    }

    @Override
    public List<Classe> queryAllClass(String exaName) {
        return recordMapper.queryAllClass(exaName);
    }

    @Override
    public List<Student> queryStudentAndPaper(Integer studentId, Integer paperId) { return recordMapper.queryStudentAndPaper(studentId,paperId); }

    @Override
    public int queryAllScore(RecordExam recordExam) {
        return recordMapper.queryAllScore(recordExam);
    }

    @Override
    public int queryAccScore(RecordExam recordExam) {
        return recordMapper.queryAccScore(recordExam);
    }

    @Override
    public void AddToScore(Toscore toscore) {
        recordMapper.AddToScore(toscore);
    }

    @Override
    public int queryBooleanToscore(Integer paperId) {
        return recordMapper.queryBooleanToscore(paperId);
    }

    @Override
    public int queryToscore(int paperId) {
        return recordMapper.queryToscore(paperId);
    }

    @Override
    public List<Record> queryPaperId(int studentId) {
        return recordMapper.queryPaperId(studentId);
    }
}
