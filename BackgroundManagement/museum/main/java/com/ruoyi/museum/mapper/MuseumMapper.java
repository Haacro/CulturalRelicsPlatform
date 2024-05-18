package com.ruoyi.museum.mapper;

import java.util.List;
import com.ruoyi.museum.domain.Museum;

/**
 * 博物馆文物信息管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public interface MuseumMapper 
{
    /**
     * 查询博物馆文物信息管理
     * 
     * @param id 博物馆文物信息管理主键
     * @return 博物馆文物信息管理
     */
    public Museum selectMuseumById(Long id);

    /**
     * 查询博物馆文物信息管理列表
     * 
     * @param museum 博物馆文物信息管理
     * @return 博物馆文物信息管理集合
     */
    public List<Museum> selectMuseumList(Museum museum);

    /**
     * 新增博物馆文物信息管理
     * 
     * @param museum 博物馆文物信息管理
     * @return 结果
     */
    public int insertMuseum(Museum museum);

    /**
     * 修改博物馆文物信息管理
     * 
     * @param museum 博物馆文物信息管理
     * @return 结果
     */
    public int updateMuseum(Museum museum);

    /**
     * 删除博物馆文物信息管理
     * 
     * @param id 博物馆文物信息管理主键
     * @return 结果
     */
    public int deleteMuseumById(Long id);

    /**
     * 批量删除博物馆文物信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMuseumByIds(Long[] ids);
}
