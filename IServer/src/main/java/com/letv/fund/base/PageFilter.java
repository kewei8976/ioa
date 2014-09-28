package com.letv.fund.base;

public class PageFilter {
	private int page;// 当前页
	private int rows;// 每页显示记录数
    private long start;
	private String sort;// 排序字段
	private String order;// asc/desc

    public long getStart() {
        return rows*(page-1);
    }

    public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

    @Override
    public String toString() {
        return "PageFilter{" +
                "page=" + page +
                ", rows=" + rows +
                ", start=" + start +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
