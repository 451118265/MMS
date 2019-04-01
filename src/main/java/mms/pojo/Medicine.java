package mms.pojo;

import lombok.Data;

@Data
public class Medicine {
	// 编号mno：char(12)
	// 名称mname：nvarchar(50)
	// 服用方法mmode：nchar(2) 内服 或 外用
	// 功效mefficacy：nvarchar(50)
	private int mid;
	private String mno;
	private String mname;
	private String mmode;
	private String mefficacy;



}
