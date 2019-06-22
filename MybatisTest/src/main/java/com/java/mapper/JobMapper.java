package com.java.mapper;

import com.java.domain.Job;
import com.java.domain.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    long countByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    int deleteByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    int insert(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    int insertSelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    List<Job> selectByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Thu Jun 20 21:21:13 CST 2019
     */
    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);
}