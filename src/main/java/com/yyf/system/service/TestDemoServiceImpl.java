package com.yyf.system.service;

import com.yyf.system.dao.TestDemoInterface;
import com.yyf.system.pojo.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wang on 2017/6/3.
 */
@Service
public class TestDemoServiceImpl implements TestDemoService{
    @Autowired
    private TestDemoInterface testDemoInterface;
    public TestDemo addTestDemo(
                         String type,
                         String college,
                         String major,
                         int highScore,
                         int highScoreRank,
                         int lowScore,
                         int lowScoreRank,
                         int averageScore,
                         int averageScoreRank,
                         String year,
                         String batch,
                         int admissionNumber)throws Exception{
        return testDemoInterface.addTestDemo(type,college,major,highScore,highScoreRank,lowScore,
                lowScoreRank, averageScore,averageScoreRank, year,batch,admissionNumber);
    }
}
