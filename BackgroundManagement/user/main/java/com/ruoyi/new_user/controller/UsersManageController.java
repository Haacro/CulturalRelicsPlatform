package com.ruoyi.new_user.controller;

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
import com.ruoyi.new_user.domain.UsersManage;
import com.ruoyi.new_user.service.IUsersManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户信息管理Controller
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@RestController
@RequestMapping("/new_user/manage")
public class UsersManageController extends BaseController
{
    @Autowired
    private IUsersManageService usersManageService;

    /**
     * 查询用户信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(UsersManage usersManage)
    {
        startPage();
        List<UsersManage> list = usersManageService.selectUsersManageList(usersManage);
        return getDataTable(list);
    }

    /**
     * 导出用户信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:export')")
    @Log(title = "用户信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UsersManage usersManage)
    {
        List<UsersManage> list = usersManageService.selectUsersManageList(usersManage);
        ExcelUtil<UsersManage> util = new ExcelUtil<UsersManage>(UsersManage.class);
        util.exportExcel(response, list, "用户信息管理数据");
    }

    /**
     * 获取用户信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(usersManageService.selectUsersManageById(id));
    }

    /**
     * 新增用户信息管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:add')")
    @Log(title = "用户信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UsersManage usersManage)
    {
        return toAjax(usersManageService.insertUsersManage(usersManage));
    }

    /**
     * 修改用户信息管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:edit')")
    @Log(title = "用户信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UsersManage usersManage)
    {
        return toAjax(usersManageService.updateUsersManage(usersManage));
    }

    /**
     * 删除用户信息管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:manage:remove')")
    @Log(title = "用户信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(usersManageService.deleteUsersManageByIds(ids));
    }
}
