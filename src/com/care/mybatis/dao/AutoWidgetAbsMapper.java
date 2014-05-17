package com.care.mybatis.dao;

import com.care.mybatis.bean.AutoWidgetAbs;
import com.care.mybatis.bean.AutoWidgetAbsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoWidgetAbsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int countByExample(AutoWidgetAbsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int deleteByExample(AutoWidgetAbsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insert(AutoWidgetAbs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insertSelective(AutoWidgetAbs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	List<AutoWidgetAbs> selectByExample(AutoWidgetAbsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	AutoWidgetAbs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExampleSelective(@Param("record") AutoWidgetAbs record, @Param("example") AutoWidgetAbsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExample(@Param("record") AutoWidgetAbs record, @Param("example") AutoWidgetAbsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByPrimaryKeySelective(AutoWidgetAbs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_widget_abs
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByPrimaryKey(AutoWidgetAbs record);
}