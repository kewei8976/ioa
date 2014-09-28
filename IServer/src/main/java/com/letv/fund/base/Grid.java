package com.letv.fund.base;

import java.util.ArrayList;
import java.util.List;

public class Grid <T>  {

	private Long total = 0L;
	private List<T> rows = new ArrayList<T>();

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

    @Override
    public String toString() {
        return "Grid{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
