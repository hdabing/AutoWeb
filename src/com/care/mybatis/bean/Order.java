package com.care.mybatis.bean;

import java.util.Date;

public class Order {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.series_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private String seriesId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.c_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer cId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Date time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.status
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.desc
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private String desc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.ship_time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Date shipTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.ship_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer shipId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.total_price
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Float totalPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order.pay_type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer payType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.id
	 * @return  the value of order.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.id
	 * @param id  the value for order.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.series_id
	 * @return  the value of order.series_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public String getSeriesId() {
		return seriesId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.series_id
	 * @param seriesId  the value for order.series_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.c_id
	 * @return  the value of order.c_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getcId() {
		return cId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.c_id
	 * @param cId  the value for order.c_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setcId(Integer cId) {
		this.cId = cId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.time
	 * @return  the value of order.time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.time
	 * @param time  the value for order.time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.status
	 * @return  the value of order.status
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.status
	 * @param status  the value for order.status
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.desc
	 * @return  the value of order.desc
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.desc
	 * @param desc  the value for order.desc
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.ship_time
	 * @return  the value of order.ship_time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Date getShipTime() {
		return shipTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.ship_time
	 * @param shipTime  the value for order.ship_time
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setShipTime(Date shipTime) {
		this.shipTime = shipTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.ship_id
	 * @return  the value of order.ship_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getShipId() {
		return shipId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.ship_id
	 * @param shipId  the value for order.ship_id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.total_price
	 * @return  the value of order.total_price
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.total_price
	 * @param totalPrice  the value for order.total_price
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order.pay_type
	 * @return  the value of order.pay_type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getPayType() {
		return payType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order.pay_type
	 * @param payType  the value for order.pay_type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
}