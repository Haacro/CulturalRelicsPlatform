package com.ruoyi.museum.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.museum.mapper.MuseumMapper;
import com.ruoyi.museum.domain.Museum;
import com.ruoyi.museum.service.IMuseumService;

/**
 * 博物馆文物信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@Service
public class MuseumServiceImpl implements IMuseumService 
{
    @Autowired
    private MuseumMapper museumMapper;

    /**
     * 查询博物馆文物信息管理
     * 
     * @param id 博物馆文物信息管理主键
     * @return 博物馆文物信息管理
     */
    @Override
    public Museum selectMuseumById(Long id)
    {
        return museumMapper.selectMuseumById(id);
    }

    /**
     * 查询博物馆文物信息管理列表
     * 
     * @param museum 博物馆文物信息管理
     * @return 博物馆文物信息管理
     */
    @Override
    public List<Museum> selectMuseumList(Museum museum)
    {
        return museumMapper.selectMuseumList(museum);
    }

    /**
     * 新增博物馆文物信息管理
     * 
     * @param museum 博物馆文物信息管理
     * @return 结果
     */
    @Override
    public int insertMuseum(Museum museum)
    {
        return museumMapper.insertMuseum(museum);
    }

    /**
     * 修改博物馆文物信息管理
     * 
     * @param museum 博物馆文物信息管理
     * @return 结果
     */
    @Override
    public int updateMuseum(Museum museum)
    {
        return museumMapper.updateMuseum(museum);
    }

    /**
     * 批量删除博物馆文物信息管理
     * 
     * @param ids 需要删除的博物馆文物信息管理主键
     * @return 结果
     */
    @Override
    public int deleteMuseumByIds(Long[] ids)
    {
        return museumMapper.deleteMuseumByIds(ids);
    }

    /**
     * 删除博物馆文物信息管理信息
     * 
     * @param id 博物馆文物信息管理主键
     * @return 结果
     */
    @Override
    public int deleteMuseumById(Long id)
    {
        return museumMapper.deleteMuseumById(id);
    }
}
