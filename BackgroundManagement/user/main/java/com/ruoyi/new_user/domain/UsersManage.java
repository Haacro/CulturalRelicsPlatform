package com.ruoyi.new_user.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户信息管理对象 users_manage
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public class UsersManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long id;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String name;

    /** 用户登录名 */
    @Excel(name = "用户登录名")
    private String username;

    /** 用户登录密码 */
    @Excel(name = "用户登录密码")
    private String password;

    /** 用户电子邮箱 */
    @Excel(name = "用户电子邮箱")
    private String email;

    /** 用户手机号码 */
    @Excel(name = "用户手机号码")
    private String phone;

    /** 用户创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "用户创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 用户上次登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "用户上次登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginAt;

    /** 用户状态（例如：启用/禁用） */
    @Excel(name = "用户状态", readConverterExp = "例=如：启用/禁用")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setLastLoginAt(Date lastLoginAt) 
    {
        this.lastLoginAt = lastLoginAt;
    }

    public Date getLastLoginAt() 
    {
        return lastLoginAt;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("email", getEmail())
            .append("phone", getPhone())
            .append("createdAt", getCreatedAt())
            .append("lastLoginAt", getLastLoginAt())
            .append("status", getStatus())
            .toString();
    }
}
