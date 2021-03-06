package com.simple.bets.modular.sys.model;


import com.simple.bets.core.annotation.ExportConfig;
import com.simple.bets.core.base.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户基本信息
 */
@Table(name = "sys_user")
public class UserModel extends BaseModel {

    private static final long serialVersionUID = -4852732617765810959L;
    /**
     * 账户状态
     */
    public static final String STATUS_VALID = "1";

    public static final String STATUS_LOCK = "0";

    /**
     * 性别
     */
    public static final String SEX_UNKNOW = "2";

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    @ExportConfig(value = "账号")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "email")
    @ExportConfig(value = "邮箱")
    private String email;

    @Column(name = "mobile")
    @ExportConfig(value = "手机")
    private String mobile;

    @Column(name = "user_status")
    @ExportConfig(value = "状态", convert = "s:0=锁定,1=有效")
    private String userStatus;


    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "sex")
    @ExportConfig(value = "性别", convert = "s:0=男,1=女,2=保密")
    private String sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "login_ip")
    private String loginIp;


    @Transient
    private String roleName;

    @Transient
    private String unpassword;

    @Transient
    private String imageBase64;

    @Transient
    private Long roleId;

    /**
     * @return USER_ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return DEPT_ID
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return MOBILE
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return LAST_LOGIN_TIME
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnpassword() {
        return unpassword;
    }

    public void setUnpassword(String unpassword) {
        this.unpassword = unpassword;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * shiro-redis v3.1.0 必须要有getAuthCacheKey()或者getId()方法
     */
    public Long getAuthCacheKey() {
        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}