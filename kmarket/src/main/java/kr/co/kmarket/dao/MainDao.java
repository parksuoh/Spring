package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Category1Vo;
import kr.co.kmarket.vo.Category2Vo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface MainDao {
	
	
	public List<Category1Vo> selectCate1(); 
	
	public List<ProductVo> selectHitProduct(); 
	public List<ProductVo> selectBestProduct(); 
	public List<ProductVo> selectRecProduct(); 

	
}
