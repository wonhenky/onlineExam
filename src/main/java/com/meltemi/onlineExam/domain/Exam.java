package com.meltemi.onlineExam.domain;

import lombok.Data;

import java.util.Date;
@Data
public class Exam {
    private int examId;
    private int paperId;
    private Date examBegin;
    private Date examEnd;
    private int classeId;
    private Paper paper;
}
