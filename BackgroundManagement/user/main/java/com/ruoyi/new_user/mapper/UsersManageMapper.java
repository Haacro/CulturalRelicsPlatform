package com.ruoyi.new_user.mapper;

import java.util.List;
import com.ruoyi.new_user.domain.UsersManage;

/**
 * 用户信息管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public interface UsersManageMapper 
{
    /**
     * 查询用户信息管理
     * 
     * @param id 用户信息管理主键
     * @return 用户信息管理
     */
    public UsersManage selectUsersManageById(Long id);

    /**
     * 查询用户信息管理列表
     * 
     * @param usersManage 用户信息管理
     * @return 用户信息管理集合
     */
    public List<UsersManage> selectUsersManageList(UsersManage usersManage);

    /**
     * 新增用户信息管理
     * 
     * @param usersManage 用户信息管理
     * @return 结果
     */
    public int insertUsersManage(UsersManage usersManage);

    /**
     * 修改用户信息管理
     * 
     * @param usersManage 用户信息管理
     * @return 结果
     */
    public int updateUsersManage(UsersManage usersManage);

    /**
     * 删除用户信息管理
     * 
     * @param id 用户信息管理主键
     * @return 结果
     */
    public int deleteUsersManageById(Long id);

    /**
     * 批量删除用户信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUsersManageByIds(Long[] ids);
}
