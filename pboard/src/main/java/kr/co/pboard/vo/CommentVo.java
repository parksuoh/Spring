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
@Table(name="PBOARD_COMMENT")
@ToString
public class CommentVo {
	
	
	@Id
	private int seq;
	private int parent;
	private String content;
	private String rdate;
	private String uid;
	private String nick;
	
	
	
}