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
@Table(name="PBOARD_USER")
public class UserVo {
	
	
	@Id
	private String uid;
	private String pass;
	private String name;
	private String nick;
	private String email;
	private String phone;
	private String rdate;
	
	
	
	
}
