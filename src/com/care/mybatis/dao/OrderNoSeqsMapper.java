package com.care.mybatis.dao;

import com.care.mybatis.bean.OrderNoSeqs;
import com.care.mybatis.bean.OrderNoSeqsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderNoSeqsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int countByExample(OrderNoSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByExample(OrderNoSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insert(OrderNoSeqs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insertSelective(OrderNoSeqs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    List<OrderNoSeqs> selectByExample(OrderNoSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    OrderNoSeqs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExampleSelective(@Param("record") OrderNoSeqs record, @Param("example") OrderNoSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExample(@Param("record") OrderNoSeqs record, @Param("example") OrderNoSeqsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKeySelective(OrderNoSeqs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_no_seqs
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKey(OrderNoSeqs record);
}