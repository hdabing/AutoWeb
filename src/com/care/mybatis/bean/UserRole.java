package com.care.mybatis.bean;

public class UserRole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.name
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	private Integer type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.id
	 * @return  the value of user_role.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.id
	 * @param id  the value for user_role.id
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.name
	 * @return  the value of user_role.name
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.name
	 * @param name  the value for user_role.name
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.type
	 * @return  the value of user_role.type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.type
	 * @param type  the value for user_role.type
	 * @mbggenerated  Sun May 11 14:15:21 CST 2014
	 */
	public void setType(Integer type) {
		this.type = type;
	}
}