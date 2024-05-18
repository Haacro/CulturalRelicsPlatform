package com.ruoyi.new_user.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户权限管理对象 user_permissions
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public class UserPermissions extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录唯一标识 */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private Long userId;

    /** 登录权限 */
    @Excel(name = "登录权限")
    private Integer loginPermission;

    /** 点赞权限 */
    @Excel(name = "点赞权限")
    private Integer likePermission;

    /** 评论权限 */
    @Excel(name = "评论权限")
    private Integer commentPermission;

    /** 逻辑删除（数据恢复） */
    @Excel(name = "逻辑删除", readConverterExp = "数=据恢复")
    private Long del;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setLoginPermission(Integer loginPermission) 
    {
        this.loginPermission = loginPermission;
    }

    public Integer getLoginPermission() 
    {
        return loginPermission;
    }
    public void setLikePermission(Integer likePermission) 
    {
        this.likePermission = likePermission;
    }

    public Integer getLikePermission() 
    {
        return likePermission;
    }
    public void setCommentPermission(Integer commentPermission) 
    {
        this.commentPermission = commentPermission;
    }

    public Integer getCommentPermission() 
    {
        return commentPermission;
    }
    public void setDel(Long del) 
    {
        this.del = del;
    }

    public Long getDel() 
    {
        return del;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("loginPermission", getLoginPermission())
            .append("likePermission", getLikePermission())
            .append("commentPermission", getCommentPermission())
            .append("del", getDel())
            .toString();
    }
}
