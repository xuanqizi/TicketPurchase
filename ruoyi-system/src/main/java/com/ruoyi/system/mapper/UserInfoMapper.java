package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserInfo;

/**
 * 用户信息补充Mapper接口
 * 
 * @author ruoyi
 * @date 2021-06-04
 */
public interface UserInfoMapper 
{
    /**
     * 查询用户信息补充
     * 
     * @param userId 用户信息补充ID
     * @return 用户信息补充
     */
    public UserInfo selectUserInfoById(Long userId);

    /**
     * 查询用户信息补充列表
     * 
     * @param userInfo 用户信息补充
     * @return 用户信息补充集合
     */
    public List<UserInfo> selectUserInfoList(UserInfo userInfo);

    /**
     * 新增用户信息补充
     * 
     * @param userInfo 用户信息补充
     * @return 结果
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     * 修改用户信息补充
     * 
     * @param userInfo 用户信息补充
     * @return 结果
     */
    public int updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户信息补充
     * 
     * @param userId 用户信息补充ID
     * @return 结果
     */
    public int deleteUserInfoById(Long userId);

    /**
     * 批量删除用户信息补充
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserInfoByIds(Long[] userIds);
}