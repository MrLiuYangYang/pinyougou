package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author 8599584
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();
	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Integer pageNum,Integer pageSize);
	
	/**
	 * 添加
	 * @param brand
	 */
	public void add(TbBrand brand);
	
	/**
	 * 修改
	 * @param brand
	 */
	public void update(TbBrand brand);
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);
	/**
	 * 品牌分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
	
	List<Map> selectOptionList();
	
	
}
