package com.ruoyi.new_user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.new_user.mapper.UsersManageMapper;
import com.ruoyi.new_user.domain.UsersManage;
import com.ruoyi.new_user.service.IUsersManageService;

/**
 * 用户信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@Service
public class UsersManageServiceImpl implements IUsersManageService 
{
    @Autowired
    private UsersManageMapper usersManageMapper;

    /**
     * 查询用户信息管理
     * 
     * @param id 用户信息管理主键
     * @return 用户信息管理
     */
    @Override
    public UsersManage selectUsersManageById(Long id)
    {
        return usersManageMapper.selectUsersManageById(id);
    }

    /**
     * 查询用户信息管理列表
     * 
     * @param usersManage 用户信息管理
     * @return 用户信息管理
     */
    @Override
    public List<UsersManage> selectUsersManageList(UsersManage usersManage)
    {
        return usersManageMapper.selectUsersManageList(usersManage);
    }

    /**
     * 新增用户信息管理
     * 
     * @param usersManage 用户信息管理
     * @return 结果
     */
    @Override
    public int insertUsersManage(UsersManage usersManage)
    {
        return usersManageMapper.insertUsersManage(usersManage);
    }

    /**
     * 修改用户信息管理
     * 
     * @param usersManage 用户信息管理
     * @return 结果
     */
    @Override
    public int updateUsersManage(UsersManage usersManage)
    {
        return usersManageMapper.updateUsersManage(usersManage);
    }

    /**
     * 批量删除用户信息管理
     * 
     * @param ids 需要删除的用户信息管理主键
     * @return 结果
     */
    @Override
    public int deleteUsersManageByIds(Long[] ids)
    {
        return usersManageMapper.deleteUsersManageByIds(ids);
    }

    /**
     * 删除用户信息管理信息
     * 
     * @param id 用户信息管理主键
     * @return 结果
     */
    @Override
    public int deleteUsersManageById(Long id)
    {
        return usersManageMapper.deleteUsersManageById(id);
    }
}
