package top.dandan0214.booksite.common;

/**
 * 用于做分页返回的响应类型
 * 
 * @author yanggang
 *
 */
public class TableModel {
	
	// 查询出来的数据总量
	private Long total;
	// 行数
	private Object rows;
	
	/**
	 * 
	 * @param total
	 *            查询出来的数据总数
	 * @param rows
	 *            全部数据
	 * @return
	 */
	public static TableModel build(Long total, Object rows){
		return new TableModel(total, rows);
	}
	
	public TableModel(Long total, Object rows){
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	
}
