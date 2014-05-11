package com.care.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutoMaintenanceAppointExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public AutoMaintenanceAppointExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUIdIsNull() {
			addCriterion("u_id is null");
			return (Criteria) this;
		}

		public Criteria andUIdIsNotNull() {
			addCriterion("u_id is not null");
			return (Criteria) this;
		}

		public Criteria andUIdEqualTo(Integer value) {
			addCriterion("u_id =", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotEqualTo(Integer value) {
			addCriterion("u_id <>", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThan(Integer value) {
			addCriterion("u_id >", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_id >=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThan(Integer value) {
			addCriterion("u_id <", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThanOrEqualTo(Integer value) {
			addCriterion("u_id <=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdIn(List<Integer> values) {
			addCriterion("u_id in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotIn(List<Integer> values) {
			addCriterion("u_id not in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdBetween(Integer value1, Integer value2) {
			addCriterion("u_id between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotBetween(Integer value1, Integer value2) {
			addCriterion("u_id not between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIsNull() {
			addCriterion("begin_time is null");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIsNotNull() {
			addCriterion("begin_time is not null");
			return (Criteria) this;
		}

		public Criteria andBeginTimeEqualTo(Date value) {
			addCriterion("begin_time =", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotEqualTo(Date value) {
			addCriterion("begin_time <>", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeGreaterThan(Date value) {
			addCriterion("begin_time >", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("begin_time >=", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeLessThan(Date value) {
			addCriterion("begin_time <", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
			addCriterion("begin_time <=", value, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeIn(List<Date> values) {
			addCriterion("begin_time in", values, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotIn(List<Date> values) {
			addCriterion("begin_time not in", values, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeBetween(Date value1, Date value2) {
			addCriterion("begin_time between", value1, value2, "beginTime");
			return (Criteria) this;
		}

		public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
			addCriterion("begin_time not between", value1, value2, "beginTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(Date value) {
			addCriterion("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(Date value) {
			addCriterion("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(Date value) {
			addCriterion("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(Date value) {
			addCriterion("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(Date value) {
			addCriterion("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<Date> values) {
			addCriterion("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<Date> values) {
			addCriterion("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(Date value1, Date value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(Date value1, Date value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andAutoNumberIsNull() {
			addCriterion("auto_number is null");
			return (Criteria) this;
		}

		public Criteria andAutoNumberIsNotNull() {
			addCriterion("auto_number is not null");
			return (Criteria) this;
		}

		public Criteria andAutoNumberEqualTo(String value) {
			addCriterion("auto_number =", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberNotEqualTo(String value) {
			addCriterion("auto_number <>", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberGreaterThan(String value) {
			addCriterion("auto_number >", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberGreaterThanOrEqualTo(String value) {
			addCriterion("auto_number >=", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberLessThan(String value) {
			addCriterion("auto_number <", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberLessThanOrEqualTo(String value) {
			addCriterion("auto_number <=", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberLike(String value) {
			addCriterion("auto_number like", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberNotLike(String value) {
			addCriterion("auto_number not like", value, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberIn(List<String> values) {
			addCriterion("auto_number in", values, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberNotIn(List<String> values) {
			addCriterion("auto_number not in", values, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberBetween(String value1, String value2) {
			addCriterion("auto_number between", value1, value2, "autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoNumberNotBetween(String value1, String value2) {
			addCriterion("auto_number not between", value1, value2,
					"autoNumber");
			return (Criteria) this;
		}

		public Criteria andAutoVendorIsNull() {
			addCriterion("auto_vendor is null");
			return (Criteria) this;
		}

		public Criteria andAutoVendorIsNotNull() {
			addCriterion("auto_vendor is not null");
			return (Criteria) this;
		}

		public Criteria andAutoVendorEqualTo(String value) {
			addCriterion("auto_vendor =", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorNotEqualTo(String value) {
			addCriterion("auto_vendor <>", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorGreaterThan(String value) {
			addCriterion("auto_vendor >", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorGreaterThanOrEqualTo(String value) {
			addCriterion("auto_vendor >=", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorLessThan(String value) {
			addCriterion("auto_vendor <", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorLessThanOrEqualTo(String value) {
			addCriterion("auto_vendor <=", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorLike(String value) {
			addCriterion("auto_vendor like", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorNotLike(String value) {
			addCriterion("auto_vendor not like", value, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorIn(List<String> values) {
			addCriterion("auto_vendor in", values, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorNotIn(List<String> values) {
			addCriterion("auto_vendor not in", values, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorBetween(String value1, String value2) {
			addCriterion("auto_vendor between", value1, value2, "autoVendor");
			return (Criteria) this;
		}

		public Criteria andAutoVendorNotBetween(String value1, String value2) {
			addCriterion("auto_vendor not between", value1, value2,
					"autoVendor");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andKmIsNull() {
			addCriterion("km is null");
			return (Criteria) this;
		}

		public Criteria andKmIsNotNull() {
			addCriterion("km is not null");
			return (Criteria) this;
		}

		public Criteria andKmEqualTo(Integer value) {
			addCriterion("km =", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmNotEqualTo(Integer value) {
			addCriterion("km <>", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmGreaterThan(Integer value) {
			addCriterion("km >", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmGreaterThanOrEqualTo(Integer value) {
			addCriterion("km >=", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmLessThan(Integer value) {
			addCriterion("km <", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmLessThanOrEqualTo(Integer value) {
			addCriterion("km <=", value, "km");
			return (Criteria) this;
		}

		public Criteria andKmIn(List<Integer> values) {
			addCriterion("km in", values, "km");
			return (Criteria) this;
		}

		public Criteria andKmNotIn(List<Integer> values) {
			addCriterion("km not in", values, "km");
			return (Criteria) this;
		}

		public Criteria andKmBetween(Integer value1, Integer value2) {
			addCriterion("km between", value1, value2, "km");
			return (Criteria) this;
		}

		public Criteria andKmNotBetween(Integer value1, Integer value2) {
			addCriterion("km not between", value1, value2, "km");
			return (Criteria) this;
		}

		public Criteria andDescIsNull() {
			addCriterion("desc is null");
			return (Criteria) this;
		}

		public Criteria andDescIsNotNull() {
			addCriterion("desc is not null");
			return (Criteria) this;
		}

		public Criteria andDescEqualTo(String value) {
			addCriterion("desc =", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotEqualTo(String value) {
			addCriterion("desc <>", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescGreaterThan(String value) {
			addCriterion("desc >", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescGreaterThanOrEqualTo(String value) {
			addCriterion("desc >=", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLessThan(String value) {
			addCriterion("desc <", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLessThanOrEqualTo(String value) {
			addCriterion("desc <=", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLike(String value) {
			addCriterion("desc like", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotLike(String value) {
			addCriterion("desc not like", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescIn(List<String> values) {
			addCriterion("desc in", values, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotIn(List<String> values) {
			addCriterion("desc not in", values, "desc");
			return (Criteria) this;
		}

		public Criteria andDescBetween(String value1, String value2) {
			addCriterion("desc between", value1, value2, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotBetween(String value1, String value2) {
			addCriterion("desc not between", value1, value2, "desc");
			return (Criteria) this;
		}

		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotEqualTo(String value) {
			addCriterion("img <>", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThan(String value) {
			addCriterion("img >", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThanOrEqualTo(String value) {
			addCriterion("img >=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThan(String value) {
			addCriterion("img <", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThanOrEqualTo(String value) {
			addCriterion("img <=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLike(String value) {
			addCriterion("img like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotLike(String value) {
			addCriterion("img not like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgIn(List<String> values) {
			addCriterion("img in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotIn(List<String> values) {
			addCriterion("img not in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgBetween(String value1, String value2) {
			addCriterion("img between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotBetween(String value1, String value2) {
			addCriterion("img not between", value1, value2, "img");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table auto_maintenance_appoint
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table auto_maintenance_appoint
     *
     * @mbggenerated do_not_delete_during_merge Sat May 03 15:51:52 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}