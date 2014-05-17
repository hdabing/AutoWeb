package com.care.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class widgettype_autobrand_rExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public widgettype_autobrand_rExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
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

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andWidgetIdIsNull() {
			addCriterion("widget_id is null");
			return (Criteria) this;
		}

		public Criteria andWidgetIdIsNotNull() {
			addCriterion("widget_id is not null");
			return (Criteria) this;
		}

		public Criteria andWidgetIdEqualTo(Integer value) {
			addCriterion("widget_id =", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdNotEqualTo(Integer value) {
			addCriterion("widget_id <>", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdGreaterThan(Integer value) {
			addCriterion("widget_id >", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("widget_id >=", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdLessThan(Integer value) {
			addCriterion("widget_id <", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdLessThanOrEqualTo(Integer value) {
			addCriterion("widget_id <=", value, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdIn(List<Integer> values) {
			addCriterion("widget_id in", values, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdNotIn(List<Integer> values) {
			addCriterion("widget_id not in", values, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdBetween(Integer value1, Integer value2) {
			addCriterion("widget_id between", value1, value2, "widgetId");
			return (Criteria) this;
		}

		public Criteria andWidgetIdNotBetween(Integer value1, Integer value2) {
			addCriterion("widget_id not between", value1, value2, "widgetId");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNull() {
			addCriterion("brand_id is null");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNotNull() {
			addCriterion("brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andBrandIdEqualTo(Integer value) {
			addCriterion("brand_id =", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotEqualTo(Integer value) {
			addCriterion("brand_id <>", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThan(Integer value) {
			addCriterion("brand_id >", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("brand_id >=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThan(Integer value) {
			addCriterion("brand_id <", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
			addCriterion("brand_id <=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdIn(List<Integer> values) {
			addCriterion("brand_id in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotIn(List<Integer> values) {
			addCriterion("brand_id not in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdBetween(Integer value1, Integer value2) {
			addCriterion("brand_id between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
			addCriterion("brand_id not between", value1, value2, "brandId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table widgettype_autobrand_r
	 * @mbggenerated  Sat May 17 18:59:17 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
     * This class corresponds to the database table widgettype_autobrand_r
     *
     * @mbggenerated do_not_delete_during_merge Wed May 14 23:50:08 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}