import request from '@/utils/request'

// 查询用户信息管理列表
export function listManage(query) {
  return request({
    url: '/new_user/manage/list',
    method: 'get',
    params: query
  })
}

// 查询用户信息管理详细
export function getManage(id) {
  return request({
    url: '/new_user/manage/' + id,
    method: 'get'
  })
}

// 新增用户信息管理
export function addManage(data) {
  return request({
    url: '/new_user/manage',
    method: 'post',
    data: data
  })
}

// 修改用户信息管理
export function updateManage(data) {
  return request({
    url: '/new_user/manage',
    method: 'put',
    data: data
  })
}

// 删除用户信息管理
export function delManage(id) {
  return request({
    url: '/new_user/manage/' + id,
    method: 'delete'
  })
}
