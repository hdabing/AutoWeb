package com.care.mybatis.dao;

import com.care.mybatis.bean.AutoWidget;
import com.care.mybatis.bean.AutoWidgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.care.mybatis.bean.AutoWidgetKey;

public interface AutoWidgetMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int countByExample(AutoWidgetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int deleteByExample(AutoWidgetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insert(AutoWidget record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insertSelective(AutoWidget record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	List<AutoWidget> selectByExample(AutoWidgetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	AutoWidget selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExampleSelective(@Param("record") AutoWidget record, @Param("example") AutoWidgetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExample(@Param("record") AutoWidget record, @Param("example") AutoWidgetExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByPrimaryKeySelective(AutoWidget record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByPrimaryKey(AutoWidget record);
}