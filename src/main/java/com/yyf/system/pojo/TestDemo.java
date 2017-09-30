package com.yyf.system.pojo;

/**
 * Created by wang on 2017/6/2.
 */
public class TestDemo {
    private int id;
    private String type;
    private String college;
    private String major;
    private int highScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getHighScoreRank() {
        return highScoreRank;
    }

    public void setHighScoreRank(int highScoreRank) {
        this.highScoreRank = highScoreRank;
    }

    public int getLowScore() {
        return lowScore;
    }

    public void setLowScore(int lowScore) {
        this.lowScore = lowScore;
    }

    public int getLowScoreRank() {
        return lowScoreRank;
    }

    public void setLowScoreRank(int lowScoreRank) {
        this.lowScoreRank = lowScoreRank;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getAverageScoreRank() {
        return averageScoreRank;
    }

    public void setAverageScoreRank(int averageScoreRank) {
        this.averageScoreRank = averageScoreRank;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    private int highScoreRank;
    private int lowScore;
    private int lowScoreRank;
    private int averageScore;
    private int averageScoreRank;
    private String year;
    private String batch;
    private int admissionNumber;
}
