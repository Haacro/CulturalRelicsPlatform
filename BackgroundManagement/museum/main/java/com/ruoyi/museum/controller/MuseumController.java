package com.ruoyi.museum.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.museum.domain.Museum;
import com.ruoyi.museum.service.IMuseumService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 博物馆文物信息管理Controller
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@RestController
@RequestMapping("/museum/museum_manage")
public class MuseumController extends BaseController
{
    @Autowired
    private IMuseumService museumService;

    /**
     * 查询博物馆文物信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(Museum museum)
    {
        startPage();
        List<Museum> list = museumService.selectMuseumList(museum);
        return getDataTable(list);
    }

    /**
     * 导出博物馆文物信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:export')")
    @Log(title = "博物馆文物信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Museum museum)
    {
        List<Museum> list = museumService.selectMuseumList(museum);
        ExcelUtil<Museum> util = new ExcelUtil<Museum>(Museum.class);
        util.exportExcel(response, list, "博物馆文物信息管理数据");
    }

    /**
     * 获取博物馆文物信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(museumService.selectMuseumById(id));
    }

    /**
     * 新增博物馆文物信息管理
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:add')")
    @Log(title = "博物馆文物信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Museum museum)
    {
        return toAjax(museumService.insertMuseum(museum));
    }

    /**
     * 修改博物馆文物信息管理
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:edit')")
    @Log(title = "博物馆文物信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Museum museum)
    {
        return toAjax(museumService.updateMuseum(museum));
    }

    /**
     * 删除博物馆文物信息管理
     */
    @PreAuthorize("@ss.hasPermi('museum:museum_manage:remove')")
    @Log(title = "博物馆文物信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(museumService.deleteMuseumByIds(ids));
    }
}
