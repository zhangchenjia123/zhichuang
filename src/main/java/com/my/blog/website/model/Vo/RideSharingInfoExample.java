package com.my.blog.website.model.Vo;

import com.my.blog.website.Enum.IsUseEnum;
import com.my.blog.website.Enum.RecommendStatusEnum;
import com.my.blog.website.Enum.SourceEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RideSharingInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public RideSharingInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
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
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
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

        public Criteria andTittleIsNull() {
            addCriterion("tittle is null");
            return (Criteria) this;
        }

        public Criteria andTittleIsNotNull() {
            addCriterion("tittle is not null");
            return (Criteria) this;
        }

        public Criteria andTittleEqualTo(String value) {
            addCriterion("tittle =", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotEqualTo(String value) {
            addCriterion("tittle <>", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThan(String value) {
            addCriterion("tittle >", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThanOrEqualTo(String value) {
            addCriterion("tittle >=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThan(String value) {
            addCriterion("tittle <", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThanOrEqualTo(String value) {
            addCriterion("tittle <=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLike(String value) {
            addCriterion("tittle like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotLike(String value) {
            addCriterion("tittle not like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleIn(List<String> values) {
            addCriterion("tittle in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotIn(List<String> values) {
            addCriterion("tittle not in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleBetween(String value1, String value2) {
            addCriterion("tittle between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotBetween(String value1, String value2) {
            addCriterion("tittle not between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlIsNull() {
            addCriterion("logoPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andLogopicurlIsNotNull() {
            addCriterion("logoPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLogopicurlEqualTo(String value) {
            addCriterion("logoPicUrl =", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlNotEqualTo(String value) {
            addCriterion("logoPicUrl <>", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlGreaterThan(String value) {
            addCriterion("logoPicUrl >", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlGreaterThanOrEqualTo(String value) {
            addCriterion("logoPicUrl >=", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlLessThan(String value) {
            addCriterion("logoPicUrl <", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlLessThanOrEqualTo(String value) {
            addCriterion("logoPicUrl <=", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlLike(String value) {
            addCriterion("logoPicUrl like", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlNotLike(String value) {
            addCriterion("logoPicUrl not like", value, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlIn(List<String> values) {
            addCriterion("logoPicUrl in", values, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlNotIn(List<String> values) {
            addCriterion("logoPicUrl not in", values, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlBetween(String value1, String value2) {
            addCriterion("logoPicUrl between", value1, value2, "logopicurl");
            return (Criteria) this;
        }

        public Criteria andLogopicurlNotBetween(String value1, String value2) {
            addCriterion("logoPicUrl not between", value1, value2, "logopicurl");
            return (Criteria) this;
        }

<<<<<<< HEAD
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

=======
>>>>>>> zhichuang/master
        public Criteria andReadNumberIsNull() {
            addCriterion("read_number is null");
            return (Criteria) this;
        }

        public Criteria andReadNumberIsNotNull() {
            addCriterion("read_number is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumberEqualTo(Integer value) {
            addCriterion("read_number =", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotEqualTo(Integer value) {
            addCriterion("read_number <>", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberGreaterThan(Integer value) {
            addCriterion("read_number >", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_number >=", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberLessThan(Integer value) {
            addCriterion("read_number <", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberLessThanOrEqualTo(Integer value) {
            addCriterion("read_number <=", value, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberIn(List<Integer> values) {
            addCriterion("read_number in", values, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotIn(List<Integer> values) {
            addCriterion("read_number not in", values, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberBetween(Integer value1, Integer value2) {
            addCriterion("read_number between", value1, value2, "readNumber");
            return (Criteria) this;
        }

        public Criteria andReadNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("read_number not between", value1, value2, "readNumber");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(SourceEnum value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(SourceEnum value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(SourceEnum value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(SourceEnum value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(SourceEnum value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(SourceEnum value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(SourceEnum value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(SourceEnum value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<SourceEnum> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<SourceEnum> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(SourceEnum value1, SourceEnum value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(SourceEnum value1, SourceEnum value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(IsUseEnum value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(IsUseEnum value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(IsUseEnum value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(IsUseEnum value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(IsUseEnum value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(IsUseEnum value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<IsUseEnum> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<IsUseEnum> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(IsUseEnum value1, IsUseEnum value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(IsUseEnum value1, IsUseEnum value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNull() {
            addCriterion("recommend_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNotNull() {
            addCriterion("recommend_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusEqualTo(RecommendStatusEnum value) {
            addCriterion("recommend_status =", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotEqualTo(RecommendStatusEnum value) {
            addCriterion("recommend_status <>", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThan(RecommendStatusEnum value) {
            addCriterion("recommend_status >", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThanOrEqualTo(RecommendStatusEnum value) {
            addCriterion("recommend_status >=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThan(RecommendStatusEnum value) {
            addCriterion("recommend_status <", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThanOrEqualTo(RecommendStatusEnum value) {
            addCriterion("recommend_status <=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIn(List<RecommendStatusEnum> values) {
            addCriterion("recommend_status in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotIn(List<RecommendStatusEnum> values) {
            addCriterion("recommend_status not in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusBetween(RecommendStatusEnum value1, RecommendStatusEnum value2) {
            addCriterion("recommend_status between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotBetween(RecommendStatusEnum value1, RecommendStatusEnum value2) {
            addCriterion("recommend_status not between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(IsUseEnum value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(IsUseEnum value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(IsUseEnum value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(IsUseEnum value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(IsUseEnum value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(IsUseEnum value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(IsUseEnum value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(IsUseEnum value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<IsUseEnum> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<IsUseEnum> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(IsUseEnum value1, IsUseEnum value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(IsUseEnum value1, IsUseEnum value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated do_not_delete_during_merge Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated do_not_delete_during_merge Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ride_sharing_info
     *
<<<<<<< HEAD
     * @mbggenerated Tue Dec 19 17:47:27 CST 2017
=======
     * @mbggenerated Tue Dec 19 09:52:04 CST 2017
>>>>>>> zhichuang/master
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