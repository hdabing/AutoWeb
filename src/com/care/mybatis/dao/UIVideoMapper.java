package com.care.mybatis.dao;

import com.care.mybatis.bean.UIVideo;
import com.care.mybatis.bean.UIVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UIVideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int countByExample(UIVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByExample(UIVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insert(UIVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insertSelective(UIVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    List<UIVideo> selectByExample(UIVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    UIVideo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExampleSelective(@Param("record") UIVideo record, @Param("example") UIVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExample(@Param("record") UIVideo record, @Param("example") UIVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKeySelective(UIVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_video
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKey(UIVideo record);
}