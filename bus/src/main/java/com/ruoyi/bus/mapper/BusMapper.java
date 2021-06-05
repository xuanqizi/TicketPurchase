package com.ruoyi.bus.mapper;

import java.util.List;
import com.ruoyi.bus.domain.Bus;

/**
 * 车次管理Mapper接口
 * 
 * @author ruoyi
 * @date 2021-06-05
 */
public interface BusMapper 
{
    /**
     * 查询车次管理
     * 
     * @param busId 车次管理ID
     * @return 车次管理
     */
    public Bus selectBusById(String busId);

    /**
     * 查询车次管理列表
     * 
     * @param bus 车次管理
     * @return 车次管理集合
     */
    public List<Bus> selectBusList(Bus bus);

    /**
     * 新增车次管理
     * 
     * @param bus 车次管理
     * @return 结果
     */
    public int insertBus(Bus bus);

    /**
     * 修改车次管理
     * 
     * @param bus 车次管理
     * @return 结果
     */
    public int updateBus(Bus bus);

    /**
     * 删除车次管理
     * 
     * @param busId 车次管理ID
     * @return 结果
     */
    public int deleteBusById(String busId);

    /**
     * 批量删除车次管理
     * 
     * @param busIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusByIds(String[] busIds);
}
