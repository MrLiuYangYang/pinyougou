package com.pinyougou.pojogroup;

import java.io.Serializable;
import java.util.List;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

public class Specification implements Serializable {
  private TbSpecification specification;
  private List<TbSpecificationOption> specificationOPtionList;
public TbSpecification getSpecification() {
	return specification;
}
public void setSpecification(TbSpecification specification) {
	this.specification = specification;
}
public List<TbSpecificationOption> getSpecificationOPtionList() {
	return specificationOPtionList;
}
public void setSpecificationOPtionList(List<TbSpecificationOption> specificationOPtionList) {
	this.specificationOPtionList = specificationOPtionList;
}
  
  


	
}
