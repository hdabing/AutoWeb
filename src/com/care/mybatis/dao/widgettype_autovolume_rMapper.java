package com.care.mybatis.dao;

import com.care.mybatis.bean.widgettype_autovolume_r;
import com.care.mybatis.bean.widgettype_autovolume_rExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface widgettype_autovolume_rMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int countByExample(widgettype_autovolume_rExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int deleteByExample(widgettype_autovolume_rExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insert(widgettype_autovolume_r record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int insertSelective(widgettype_autovolume_r record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	List<widgettype_autovolume_r> selectByExample(widgettype_autovolume_rExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExampleSelective(@Param("record") widgettype_autovolume_r record, @Param("example") widgettype_autovolume_rExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autovolume_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	int updateByExample(@Param("record") widgettype_autovolume_r record, @Param("example") widgettype_autovolume_rExample example);
}