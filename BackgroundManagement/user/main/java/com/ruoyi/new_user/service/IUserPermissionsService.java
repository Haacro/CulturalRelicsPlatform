package com.ruoyi.new_user.service;

import java.util.List;
import com.ruoyi.new_user.domain.UserPermissions;

/**
 * 用户权限管理Service接口
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public interface IUserPermissionsService 
{
    /**
     * 查询用户权限管理
     * 
     * @param id 用户权限管理主键
     * @return 用户权限管理
     */
    public UserPermissions selectUserPermissionsById(Long id);

    /**
     * 查询用户权限管理列表
     * 
     * @param userPermissions 用户权限管理
     * @return 用户权限管理集合
     */
    public List<UserPermissions> selectUserPermissionsList(UserPermissions userPermissions);

    /**
     * 新增用户权限管理
     * 
     * @param userPermissions 用户权限管理
     * @return 结果
     */
    public int insertUserPermissions(UserPermissions userPermissions);

    /**
     * 修改用户权限管理
     * 
     * @param userPermissions 用户权限管理
     * @return 结果
     */
    public int updateUserPermissions(UserPermissions userPermissions);

    /**
     * 批量删除用户权限管理
     * 
     * @param ids 需要删除的用户权限管理主键集合
     * @return 结果
     */
    public int deleteUserPermissionsByIds(Long[] ids);

    /**
     * 删除用户权限管理信息
     * 
     * @param id 用户权限管理主键
     * @return 结果
     */
    public int deleteUserPermissionsById(Long id);
}
