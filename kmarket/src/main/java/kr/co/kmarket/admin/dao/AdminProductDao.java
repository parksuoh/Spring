package kr.co.kmarket.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.ProductVo;

@Repository
public interface AdminProductDao {
	
	
	public void insertProduct(ProductVo vo);
	public ProductVo selectProduct();
	public List<ProductVo> selectProducts(int start);
	public void updateProduct();
	public void deleteProduct();
	
	public int selectCountProducts();
	
}