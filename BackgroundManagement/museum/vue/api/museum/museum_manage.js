import request from '@/utils/request'

// 查询博物馆文物信息管理列表
export function listMuseum_manage(query) {
  return request({
    url: '/museum/museum_manage/list',
    method: 'get',
    params: query
  })
}

// 查询博物馆文物信息管理详细
export function getMuseum_manage(id) {
  return request({
    url: '/museum/museum_manage/' + id,
    method: 'get'
  })
}

// 新增博物馆文物信息管理
export function addMuseum_manage(data) {
  return request({
    url: '/museum/museum_manage',
    method: 'post',
    data: data
  })
}

// 修改博物馆文物信息管理
export function updateMuseum_manage(data) {
  return request({
    url: '/museum/museum_manage',
    method: 'put',
    data: data
  })
}

// 删除博物馆文物信息管理
export function delMuseum_manage(id) {
  return request({
    url: '/museum/museum_manage/' + id,
    method: 'delete'
  })
}
