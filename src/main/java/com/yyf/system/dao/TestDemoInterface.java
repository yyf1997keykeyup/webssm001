package com.yyf.system.dao;

import com.yyf.system.pojo.TestDemo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wang on 2017/6/3.
 */
public interface TestDemoInterface {

    TestDemo addTestDemo(
            @Param("type") String type,
            @Param("college") String college,
            @Param("major") String major,
            @Param("highScore") int highScore,
            @Param("highScoreRank") int highScoreRank,
            @Param("lowScore") int lowScore,
            @Param("lowScoreRank") int lowScoreRank,
            @Param("averageScore") int averageScore,
            @Param("averageScoreRank") int averageScoreRank,
            @Param("year") String year,
            @Param("batch") String batch,
            @Param("admissionNumber") int admissionNumber);
}
