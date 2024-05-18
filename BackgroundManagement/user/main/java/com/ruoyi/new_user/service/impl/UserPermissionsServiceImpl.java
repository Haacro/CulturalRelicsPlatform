package com.ruoyi.new_user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.new_user.mapper.UserPermissionsMapper;
import com.ruoyi.new_user.domain.UserPermissions;
import com.ruoyi.new_user.service.IUserPermissionsService;

/**
 * 用户权限管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@Service
public class UserPermissionsServiceImpl implements IUserPermissionsService 
{
    @Autowired
    private UserPermissionsMapper userPermissionsMapper;

    /**
     * 查询用户权限管理
     * 
     * @param id 用户权限管理主键
     * @return 用户权限管理
     */
    @Override
    public UserPermissions selectUserPermissionsById(Long id)
    {
        return userPermissionsMapper.selectUserPermissionsById(id);
    }

    /**
     * 查询用户权限管理列表
     * 
     * @param userPermissions 用户权限管理
     * @return 用户权限管理
     */
    @Override
    public List<UserPermissions> selectUserPermissionsList(UserPermissions userPermissions)
    {
        return userPermissionsMapper.selectUserPermissionsList(userPermissions);
    }

    /**
     * 新增用户权限管理
     * 
     * @param userPermissions 用户权限管理
     * @return 结果
     */
    @Override
    public int insertUserPermissions(UserPermissions userPermissions)
    {
        return userPermissionsMapper.insertUserPermissions(userPermissions);
    }

    /**
     * 修改用户权限管理
     * 
     * @param userPermissions 用户权限管理
     * @return 结果
     */
    @Override
    public int updateUserPermissions(UserPermissions userPermissions)
    {
        return userPermissionsMapper.updateUserPermissions(userPermissions);
    }

    /**
     * 批量删除用户权限管理
     * 
     * @param ids 需要删除的用户权限管理主键
     * @return 结果
     */
    @Override
    public int deleteUserPermissionsByIds(Long[] ids)
    {
        return userPermissionsMapper.deleteUserPermissionsByIds(ids);
    }

    /**
     * 删除用户权限管理信息
     * 
     * @param id 用户权限管理主键
     * @return 结果
     */
    @Override
    public int deleteUserPermissionsById(Long id)
    {
        return userPermissionsMapper.deleteUserPermissionsById(id);
    }
}
