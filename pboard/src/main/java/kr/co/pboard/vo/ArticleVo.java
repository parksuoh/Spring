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
@Table(name="PBOARD_ARTICLE")
@ToString
public class ArticleVo {
	
	
	@Id
	private int seq;
	private int comment;
	private String title;
	private String content;
	private int hit;
	private String rdate;
	private String uid;
	private String nick;
	private int good;
	private int bed;
	
	
	
	
}