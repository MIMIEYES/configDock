package com.tianhaoera.comment.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoParam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected int start = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected int count = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public DemoParam() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void setStart(int start) {
        this.start=start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public int getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public void setCount(int count) {
        this.count=count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbggenerated
     */
    public int getCount() {
        return count;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbggenerated
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBytecolIsNull() {
            addCriterion("byteCol is null");
            return (Criteria) this;
        }

        public Criteria andBytecolIsNotNull() {
            addCriterion("byteCol is not null");
            return (Criteria) this;
        }

        public Criteria andBytecolEqualTo(Byte value) {
            addCriterion("byteCol =", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolNotEqualTo(Byte value) {
            addCriterion("byteCol <>", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolGreaterThan(Byte value) {
            addCriterion("byteCol >", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolGreaterThanOrEqualTo(Byte value) {
            addCriterion("byteCol >=", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolLessThan(Byte value) {
            addCriterion("byteCol <", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolLessThanOrEqualTo(Byte value) {
            addCriterion("byteCol <=", value, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolIn(List<Byte> values) {
            addCriterion("byteCol in", values, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolNotIn(List<Byte> values) {
            addCriterion("byteCol not in", values, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolBetween(Byte value1, Byte value2) {
            addCriterion("byteCol between", value1, value2, "bytecol");
            return (Criteria) this;
        }

        public Criteria andBytecolNotBetween(Byte value1, Byte value2) {
            addCriterion("byteCol not between", value1, value2, "bytecol");
            return (Criteria) this;
        }

        public Criteria andShortcolIsNull() {
            addCriterion("shortCol is null");
            return (Criteria) this;
        }

        public Criteria andShortcolIsNotNull() {
            addCriterion("shortCol is not null");
            return (Criteria) this;
        }

        public Criteria andShortcolEqualTo(Short value) {
            addCriterion("shortCol =", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolNotEqualTo(Short value) {
            addCriterion("shortCol <>", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolGreaterThan(Short value) {
            addCriterion("shortCol >", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolGreaterThanOrEqualTo(Short value) {
            addCriterion("shortCol >=", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolLessThan(Short value) {
            addCriterion("shortCol <", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolLessThanOrEqualTo(Short value) {
            addCriterion("shortCol <=", value, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolIn(List<Short> values) {
            addCriterion("shortCol in", values, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolNotIn(List<Short> values) {
            addCriterion("shortCol not in", values, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolBetween(Short value1, Short value2) {
            addCriterion("shortCol between", value1, value2, "shortcol");
            return (Criteria) this;
        }

        public Criteria andShortcolNotBetween(Short value1, Short value2) {
            addCriterion("shortCol not between", value1, value2, "shortcol");
            return (Criteria) this;
        }

        public Criteria andIntcolIsNull() {
            addCriterion("intCol is null");
            return (Criteria) this;
        }

        public Criteria andIntcolIsNotNull() {
            addCriterion("intCol is not null");
            return (Criteria) this;
        }

        public Criteria andIntcolEqualTo(Integer value) {
            addCriterion("intCol =", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolNotEqualTo(Integer value) {
            addCriterion("intCol <>", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolGreaterThan(Integer value) {
            addCriterion("intCol >", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolGreaterThanOrEqualTo(Integer value) {
            addCriterion("intCol >=", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolLessThan(Integer value) {
            addCriterion("intCol <", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolLessThanOrEqualTo(Integer value) {
            addCriterion("intCol <=", value, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolIn(List<Integer> values) {
            addCriterion("intCol in", values, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolNotIn(List<Integer> values) {
            addCriterion("intCol not in", values, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolBetween(Integer value1, Integer value2) {
            addCriterion("intCol between", value1, value2, "intcol");
            return (Criteria) this;
        }

        public Criteria andIntcolNotBetween(Integer value1, Integer value2) {
            addCriterion("intCol not between", value1, value2, "intcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolIsNull() {
            addCriterion("floatCol is null");
            return (Criteria) this;
        }

        public Criteria andFloatcolIsNotNull() {
            addCriterion("floatCol is not null");
            return (Criteria) this;
        }

        public Criteria andFloatcolEqualTo(Float value) {
            addCriterion("floatCol =", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolNotEqualTo(Float value) {
            addCriterion("floatCol <>", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolGreaterThan(Float value) {
            addCriterion("floatCol >", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolGreaterThanOrEqualTo(Float value) {
            addCriterion("floatCol >=", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolLessThan(Float value) {
            addCriterion("floatCol <", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolLessThanOrEqualTo(Float value) {
            addCriterion("floatCol <=", value, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolIn(List<Float> values) {
            addCriterion("floatCol in", values, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolNotIn(List<Float> values) {
            addCriterion("floatCol not in", values, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolBetween(Float value1, Float value2) {
            addCriterion("floatCol between", value1, value2, "floatcol");
            return (Criteria) this;
        }

        public Criteria andFloatcolNotBetween(Float value1, Float value2) {
            addCriterion("floatCol not between", value1, value2, "floatcol");
            return (Criteria) this;
        }

        public Criteria andDoublecolIsNull() {
            addCriterion("doubleCol is null");
            return (Criteria) this;
        }

        public Criteria andDoublecolIsNotNull() {
            addCriterion("doubleCol is not null");
            return (Criteria) this;
        }

        public Criteria andDoublecolEqualTo(Double value) {
            addCriterion("doubleCol =", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolNotEqualTo(Double value) {
            addCriterion("doubleCol <>", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolGreaterThan(Double value) {
            addCriterion("doubleCol >", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolGreaterThanOrEqualTo(Double value) {
            addCriterion("doubleCol >=", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolLessThan(Double value) {
            addCriterion("doubleCol <", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolLessThanOrEqualTo(Double value) {
            addCriterion("doubleCol <=", value, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolIn(List<Double> values) {
            addCriterion("doubleCol in", values, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolNotIn(List<Double> values) {
            addCriterion("doubleCol not in", values, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolBetween(Double value1, Double value2) {
            addCriterion("doubleCol between", value1, value2, "doublecol");
            return (Criteria) this;
        }

        public Criteria andDoublecolNotBetween(Double value1, Double value2) {
            addCriterion("doubleCol not between", value1, value2, "doublecol");
            return (Criteria) this;
        }

        public Criteria andBoolcolIsNull() {
            addCriterion("boolCol is null");
            return (Criteria) this;
        }

        public Criteria andBoolcolIsNotNull() {
            addCriterion("boolCol is not null");
            return (Criteria) this;
        }

        public Criteria andBoolcolEqualTo(Boolean value) {
            addCriterion("boolCol =", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolNotEqualTo(Boolean value) {
            addCriterion("boolCol <>", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolGreaterThan(Boolean value) {
            addCriterion("boolCol >", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("boolCol >=", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolLessThan(Boolean value) {
            addCriterion("boolCol <", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolLessThanOrEqualTo(Boolean value) {
            addCriterion("boolCol <=", value, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolIn(List<Boolean> values) {
            addCriterion("boolCol in", values, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolNotIn(List<Boolean> values) {
            addCriterion("boolCol not in", values, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolBetween(Boolean value1, Boolean value2) {
            addCriterion("boolCol between", value1, value2, "boolcol");
            return (Criteria) this;
        }

        public Criteria andBoolcolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("boolCol not between", value1, value2, "boolcol");
            return (Criteria) this;
        }

        public Criteria andStringcol1IsNull() {
            addCriterion("StringCol1 is null");
            return (Criteria) this;
        }

        public Criteria andStringcol1IsNotNull() {
            addCriterion("StringCol1 is not null");
            return (Criteria) this;
        }

        public Criteria andStringcol1EqualTo(String value) {
            addCriterion("StringCol1 =", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1NotEqualTo(String value) {
            addCriterion("StringCol1 <>", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1GreaterThan(String value) {
            addCriterion("StringCol1 >", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1GreaterThanOrEqualTo(String value) {
            addCriterion("StringCol1 >=", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1LessThan(String value) {
            addCriterion("StringCol1 <", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1LessThanOrEqualTo(String value) {
            addCriterion("StringCol1 <=", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1Like(String value) {
            addCriterion("StringCol1 like", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1NotLike(String value) {
            addCriterion("StringCol1 not like", value, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1In(List<String> values) {
            addCriterion("StringCol1 in", values, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1NotIn(List<String> values) {
            addCriterion("StringCol1 not in", values, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1Between(String value1, String value2) {
            addCriterion("StringCol1 between", value1, value2, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol1NotBetween(String value1, String value2) {
            addCriterion("StringCol1 not between", value1, value2, "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol2IsNull() {
            addCriterion("StringCol2 is null");
            return (Criteria) this;
        }

        public Criteria andStringcol2IsNotNull() {
            addCriterion("StringCol2 is not null");
            return (Criteria) this;
        }

        public Criteria andStringcol2EqualTo(String value) {
            addCriterion("StringCol2 =", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2NotEqualTo(String value) {
            addCriterion("StringCol2 <>", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2GreaterThan(String value) {
            addCriterion("StringCol2 >", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2GreaterThanOrEqualTo(String value) {
            addCriterion("StringCol2 >=", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2LessThan(String value) {
            addCriterion("StringCol2 <", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2LessThanOrEqualTo(String value) {
            addCriterion("StringCol2 <=", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2Like(String value) {
            addCriterion("StringCol2 like", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2NotLike(String value) {
            addCriterion("StringCol2 not like", value, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2In(List<String> values) {
            addCriterion("StringCol2 in", values, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2NotIn(List<String> values) {
            addCriterion("StringCol2 not in", values, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2Between(String value1, String value2) {
            addCriterion("StringCol2 between", value1, value2, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andStringcol2NotBetween(String value1, String value2) {
            addCriterion("StringCol2 not between", value1, value2, "stringcol2");
            return (Criteria) this;
        }

        public Criteria andDatecolIsNull() {
            addCriterion("dateCol is null");
            return (Criteria) this;
        }

        public Criteria andDatecolIsNotNull() {
            addCriterion("dateCol is not null");
            return (Criteria) this;
        }

        public Criteria andDatecolEqualTo(Date value) {
            addCriterionForJDBCDate("dateCol =", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolNotEqualTo(Date value) {
            addCriterionForJDBCDate("dateCol <>", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolGreaterThan(Date value) {
            addCriterionForJDBCDate("dateCol >", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateCol >=", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolLessThan(Date value) {
            addCriterionForJDBCDate("dateCol <", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateCol <=", value, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolIn(List<Date> values) {
            addCriterionForJDBCDate("dateCol in", values, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolNotIn(List<Date> values) {
            addCriterionForJDBCDate("dateCol not in", values, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateCol between", value1, value2, "datecol");
            return (Criteria) this;
        }

        public Criteria andDatecolNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateCol not between", value1, value2, "datecol");
            return (Criteria) this;
        }

        public Criteria andStringcol1LikeInsensitive(String value) {
            addCriterion("upper(StringCol1) like", value.toUpperCase(), "stringcol1");
            return (Criteria) this;
        }

        public Criteria andStringcol2LikeInsensitive(String value) {
            addCriterion("upper(StringCol2) like", value.toUpperCase(), "stringcol2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table demo
     *
     * @mbggenerated
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
}