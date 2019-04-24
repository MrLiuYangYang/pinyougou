package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
import entity.Result;





@RestController
@RequestMapping("/brand")
public class BrandController {
@Reference
	private BrandService brandService;
	@RequestMapping("/findAll")
	 public List<TbBrand> findAll(){
		 return brandService.findAll();
	 }
	
	
	/**
	 * 返回全部列表
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(Integer page,Integer size) {
		
		return brandService.findPage(page, size);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand) {
		  try {
			  brandService.add(brand);
			  return new Result(true,"新增成功");
		  }catch (Exception e) {
			  e.printStackTrace();
			 return new Result(true,"新增成功");
	}
}
	
	/**
	 * 修改
	 * @param brand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand brand) {
		try {
			brandService.update(brand);
			return new Result(true,"修改成功");
		} catch (Exception e) {
			 e.printStackTrace();
			 return new Result(false,"修改失败");
		}
	}
	/**
	 *  获取实体类
	 *  
	 */
	@RequestMapping("/findOne")
	public TbBrand findOne(Long id) {
		return brandService.findOne(id);
		
	}
	/**
	 * 批量删除
	 */
	@RequestMapping("/delete")
	public Result delete(Long[] ids) {
		try {
			brandService.delete(ids);
			return new Result(true,"删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false,"删除失败");
		}
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBrand brand, int page, int rows ){
		
		return brandService.findPage(brand, page, rows);
		}
	
	
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList(){
		return brandService.selectOptionList();
	}
	
	}
