package com.xiaoyu.lingdian.service;

import com.xiaoyu.lingdian.core.mybatis.page.Page;
import com.xiaoyu.lingdian.entity.CoreUser;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 */
public interface CoreUserService {

 	/**
	* 添加
	* @param coreUser
	* @return
	*/
	public boolean insertCoreUser(CoreUser coreUser);

	/**
	* 修改
	* @param coreUser
	* @return
	*/
	public boolean updateCoreUser(CoreUser coreUser);

	/**
	 * 修改佣金
	 * @param crusrUuid
	 * @param crusrWeekIncome
	 * @param crusrTotalIncome
	 * @param crusrEnableIncome
	 * @param crusrFrozenIncome
	 * @return
	 */
	public boolean updateCoreUserByIncome(String crusrUuid, double crusrWeekIncome, double crusrTotalIncome, double crusrEnableIncome, double crusrFrozenIncome);

	/**
	 * 修改下级成员人数
	 * @param crusrUuid
	 * @return
	 */
	public boolean updateCoreUserByDownCount(String crusrUuid);

	/**
	* 根据openid修改
	* @param coreUser
	* @return
	*/
	public boolean updateCoreUserByOpenid(CoreUser coreUser);
	
	/**
	* 批量软删除
	* @param list
	* @return boolean
	*/
	public boolean updateBatchCoreUserByIds(List<String> list);

	/**
	* 根据UUID查询
	* @param coreUser
	* @return
	*/
	public CoreUser getCoreUser(CoreUser coreUser);

	/**
	 * 根据邀请码查询
	 * @param crusrInviteCode
	 * @return
	 */
	public CoreUser getCoreUserByInviteCode(String crusrInviteCode);

	/**
	* 根据openid查询
	* @param crusrOpenid
	* @return
	*/
	public CoreUser getCoreUserByOpenId(String crusrOpenid);

	/**
	* 查询用户Mapper
	* @param list
	* @return List
	*/
	public Map<String, CoreUser> findCoreUserMapByUuidList(List<String> list);

	/**
	* 查询所有List
	* @param crusrName
	* @param list
	* @return List
	*/
	public List<CoreUser> findCoreUserList(String crusrName, List<String> list);

    /**
     * 查询所有Page
     *
     * @return Page
     */
    public Page<CoreUser> findCoreUserPage(CoreUser coreUser, int pageNum, int pageSize);

	/**
	 * 获取我的一级或二级U友数量
	 * @param user
	 * @param list
	 * @return
	 */
	public int getCountUserOneOrTwo(String user, List<String> list);

	/**
	 * 获取我的一级或二级U友list
	 * @param user
	 * @param list
	 * @return List
	 */
	public List<CoreUser> findCoreUserByMyOneOrTwo(String user, List<String> list);

	/**
	 * 获取我的一级或二级U友page
	 * @param user
	 * @param list
	 * @return Page
	 */
	public Page<CoreUser> findCoreUserByMyOneOrTwo(String user, List<String> list, int pageNum, int pageSize);

}