package com.dream.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNull() {
            addCriterion("CHINESE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNotNull() {
            addCriterion("CHINESE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChineseNameEqualTo(String value) {
            addCriterion("CHINESE_NAME =", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotEqualTo(String value) {
            addCriterion("CHINESE_NAME <>", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThan(String value) {
            addCriterion("CHINESE_NAME >", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHINESE_NAME >=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThan(String value) {
            addCriterion("CHINESE_NAME <", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThanOrEqualTo(String value) {
            addCriterion("CHINESE_NAME <=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLike(String value) {
            addCriterion("CHINESE_NAME like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLike(String value) {
            addCriterion("CHINESE_NAME not like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameIn(List<String> values) {
            addCriterion("CHINESE_NAME in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotIn(List<String> values) {
            addCriterion("CHINESE_NAME not in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameBetween(String value1, String value2) {
            addCriterion("CHINESE_NAME between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotBetween(String value1, String value2) {
            addCriterion("CHINESE_NAME not between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedIsNull() {
            addCriterion("WHEN_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedIsNotNull() {
            addCriterion("WHEN_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED =", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED <>", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED >", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED >=", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedLessThan(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED <", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_CREATED <=", value, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("WHEN_CREATED in", values, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("WHEN_CREATED not in", values, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WHEN_CREATED between", value1, value2, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WHEN_CREATED not between", value1, value2, "whenCreated");
            return (Criteria) this;
        }

        public Criteria andWhenModifideIsNull() {
            addCriterion("WHEN_MODIFIDE is null");
            return (Criteria) this;
        }

        public Criteria andWhenModifideIsNotNull() {
            addCriterion("WHEN_MODIFIDE is not null");
            return (Criteria) this;
        }

        public Criteria andWhenModifideEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE =", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideNotEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE <>", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideGreaterThan(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE >", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE >=", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideLessThan(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE <", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WHEN_MODIFIDE <=", value, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideIn(List<Date> values) {
            addCriterionForJDBCDate("WHEN_MODIFIDE in", values, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideNotIn(List<Date> values) {
            addCriterionForJDBCDate("WHEN_MODIFIDE not in", values, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WHEN_MODIFIDE between", value1, value2, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhenModifideNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WHEN_MODIFIDE not between", value1, value2, "whenModifide");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedIsNull() {
            addCriterion("WHO_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedIsNotNull() {
            addCriterion("WHO_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedEqualTo(String value) {
            addCriterion("WHO_CREATED =", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedNotEqualTo(String value) {
            addCriterion("WHO_CREATED <>", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedGreaterThan(String value) {
            addCriterion("WHO_CREATED >", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("WHO_CREATED >=", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedLessThan(String value) {
            addCriterion("WHO_CREATED <", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedLessThanOrEqualTo(String value) {
            addCriterion("WHO_CREATED <=", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedLike(String value) {
            addCriterion("WHO_CREATED like", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedNotLike(String value) {
            addCriterion("WHO_CREATED not like", value, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedIn(List<String> values) {
            addCriterion("WHO_CREATED in", values, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedNotIn(List<String> values) {
            addCriterion("WHO_CREATED not in", values, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedBetween(String value1, String value2) {
            addCriterion("WHO_CREATED between", value1, value2, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoCreatedNotBetween(String value1, String value2) {
            addCriterion("WHO_CREATED not between", value1, value2, "whoCreated");
            return (Criteria) this;
        }

        public Criteria andWhoModifideIsNull() {
            addCriterion("WHO_MODIFIDE is null");
            return (Criteria) this;
        }

        public Criteria andWhoModifideIsNotNull() {
            addCriterion("WHO_MODIFIDE is not null");
            return (Criteria) this;
        }

        public Criteria andWhoModifideEqualTo(String value) {
            addCriterion("WHO_MODIFIDE =", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideNotEqualTo(String value) {
            addCriterion("WHO_MODIFIDE <>", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideGreaterThan(String value) {
            addCriterion("WHO_MODIFIDE >", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideGreaterThanOrEqualTo(String value) {
            addCriterion("WHO_MODIFIDE >=", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideLessThan(String value) {
            addCriterion("WHO_MODIFIDE <", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideLessThanOrEqualTo(String value) {
            addCriterion("WHO_MODIFIDE <=", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideLike(String value) {
            addCriterion("WHO_MODIFIDE like", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideNotLike(String value) {
            addCriterion("WHO_MODIFIDE not like", value, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideIn(List<String> values) {
            addCriterion("WHO_MODIFIDE in", values, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideNotIn(List<String> values) {
            addCriterion("WHO_MODIFIDE not in", values, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideBetween(String value1, String value2) {
            addCriterion("WHO_MODIFIDE between", value1, value2, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andWhoModifideNotBetween(String value1, String value2) {
            addCriterion("WHO_MODIFIDE not between", value1, value2, "whoModifide");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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