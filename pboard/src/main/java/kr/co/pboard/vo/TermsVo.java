package kr.co.pboard.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="PBOARD_TERMS")
@ToString
public class TermsVo {
	
	
	@Id
	private int seq;
	private String terms1;
	private String terms2;

	
}