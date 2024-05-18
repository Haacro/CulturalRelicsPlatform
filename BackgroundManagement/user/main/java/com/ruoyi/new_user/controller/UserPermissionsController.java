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
import com.ruoyi.new_user.domain.UserPermissions;
import com.ruoyi.new_user.service.IUserPermissionsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户权限管理Controller
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
@RestController
@RequestMapping("/new_user/permissions")
public class UserPermissionsController extends BaseController
{
    @Autowired
    private IUserPermissionsService userPermissionsService;

    /**
     * 查询用户权限管理列表
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserPermissions userPermissions)
    {
        startPage();
        List<UserPermissions> list = userPermissionsService.selectUserPermissionsList(userPermissions);
        return getDataTable(list);
    }

    /**
     * 导出用户权限管理列表
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:export')")
    @Log(title = "用户权限管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserPermissions userPermissions)
    {
        List<UserPermissions> list = userPermissionsService.selectUserPermissionsList(userPermissions);
        ExcelUtil<UserPermissions> util = new ExcelUtil<UserPermissions>(UserPermissions.class);
        util.exportExcel(response, list, "用户权限管理数据");
    }

    /**
     * 获取用户权限管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(userPermissionsService.selectUserPermissionsById(id));
    }

    /**
     * 新增用户权限管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:add')")
    @Log(title = "用户权限管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserPermissions userPermissions)
    {
        return toAjax(userPermissionsService.insertUserPermissions(userPermissions));
    }

    /**
     * 修改用户权限管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:edit')")
    @Log(title = "用户权限管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserPermissions userPermissions)
    {
        return toAjax(userPermissionsService.updateUserPermissions(userPermissions));
    }

    /**
     * 删除用户权限管理
     */
    @PreAuthorize("@ss.hasPermi('new_user:permissions:remove')")
    @Log(title = "用户权限管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userPermissionsService.deleteUserPermissionsByIds(ids));
    }
}
