import request from '@/utils/request'

// 查询用户权限管理列表
export function listPermissions(query) {
  return request({
    url: '/new_user/permissions/list',
    method: 'get',
    params: query
  })
}

// 查询用户权限管理详细
export function getPermissions(id) {
  return request({
    url: '/new_user/permissions/' + id,
    method: 'get'
  })
}

// 新增用户权限管理
export function addPermissions(data) {
  return request({
    url: '/new_user/permissions',
    method: 'post',
    data: data
  })
}

// 修改用户权限管理
export function updatePermissions(data) {
  return request({
    url: '/new_user/permissions',
    method: 'put',
    data: data
  })
}

// 删除用户权限管理
export function delPermissions(id) {
  return request({
    url: '/new_user/permissions/' + id,
    method: 'delete'
  })
}
