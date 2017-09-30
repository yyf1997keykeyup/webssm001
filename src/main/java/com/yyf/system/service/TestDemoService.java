package com.yyf.system.service;

import com.yyf.system.pojo.TestDemo;

/**
 * Created by wang on 2017/6/3.
 */
public interface TestDemoService {
    TestDemo addTestDemo(
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
            int admissionNumber)throws Exception;
}
