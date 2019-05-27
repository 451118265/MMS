package mms.pojo;

import lombok.Data;


import java.sql.Date;

@Data
public class Client {
    // 编号cno：char(10)
    // 姓名cname：nvarchar(8)
    // 性别csex：nchar(1) 男 或 女
    // 年龄cage：int(4)
    // 住址caddress：nvarchar(50)
    // 电话cphone：nvarchar(20)
    // 症状csymptom：nvarchar(50)
    // 已购药品mno：char(12)
    // 经办人ano：char(8)
    // 录入日期cdate：datetime(8)
    // 备注cremark：nvarchar(50)
    private int cid;
    private String cno;
    private String cname;
    private String csex;
    private String cage;
    private String caddress;
    private String cphone;
    private String csymptom;
    private String mno;
    private String ano;
    private Date cdate;
    private String cremark;

}
