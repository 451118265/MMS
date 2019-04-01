package mms.pojo;

import lombok.Data;

@Data
public class Agency {
	// 编号ano：char(8)
	// 姓名aname：char(8)
	// 性别asex：nchar(1) 男 或 女
	// 电话aphone：char(12)
	// 备注aremark：varchar(50)
	private int aid;
	private String ano;
	private String aname;
	private String asex;
	private String aphone;
	private String aremark;


}
