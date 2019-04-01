package mms.pojo;

import lombok.Data;

import java.util.List;

@Data
public class EasyUIResult {
	// easyui返回json格式进行分页
	private Integer total;
	private List<?> rows;

	public EasyUIResult() {
	}

	public EasyUIResult(Integer total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}

	public EasyUIResult(Long total, List<?> rows) {
		this.total = total.intValue();
		this.rows = rows;
	}

	
}
