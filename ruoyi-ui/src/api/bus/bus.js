import request from '@/utils/request'

// 查询车次管理列表
export function listBus(query) {
  return request({
    url: '/bus/bus/list',
    method: 'get',
    params: query
  })
}

// 查询车次管理详细
export function getBus(busId) {
  return request({
    url: '/bus/bus/' + busId,
    method: 'get'
  })
}

// 新增车次管理
export function addBus(data) {
  return request({
    url: '/bus/bus',
    method: 'post',
    data: data
  })
}

// 修改车次管理
export function updateBus(data) {
  return request({
    url: '/bus/bus',
    method: 'put',
    data: data
  })
}

// 删除车次管理
export function delBus(busId) {
  return request({
    url: '/bus/bus/' + busId,
    method: 'delete'
  })
}

// 导出车次管理
export function exportBus(query) {
  return request({
    url: '/bus/bus/export',
    method: 'get',
    params: query
  })
}