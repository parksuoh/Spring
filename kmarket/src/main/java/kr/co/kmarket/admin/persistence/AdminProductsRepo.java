package kr.co.kmarket.admin.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Category1Vo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface AdminProductsRepo extends JpaRepository<ProductVo, Integer>{
	
	
	
	
}
