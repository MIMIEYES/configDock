package com.tianhaoera.comment.mybatis.mapper;

import com.tianhaoera.comment.bean.Demo;
import com.tianhaoera.comment.bean.DemoParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface  DemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int countByExample(DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int deleteByExample(DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int insert(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int insertSelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    List<Demo> selectByExampleWithBLOBs(DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    List<Demo> selectByExample(DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    Demo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Demo record, @Param("example") DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Demo record, @Param("example") DemoParam example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Demo record);
}