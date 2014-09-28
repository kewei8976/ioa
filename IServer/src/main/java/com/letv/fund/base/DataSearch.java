package com.letv.fund.base;


/**
 * Created by Nathan.yan on 14-9-2.
 * Email:yanliang.yl@hotamil.com
 */
public class DataSearch<T> {
    private T data;
    private PageFilter pageFilter;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public PageFilter getPageFilter() {
        return pageFilter;
    }

    public void setPageFilter(PageFilter pageFilter) {
        this.pageFilter = pageFilter;
    }

    @Override
    public String toString() {
        return "SellerSearch{" +
                "data=" + data +
                ", pageFilter=" + pageFilter +
                '}';
    }
}
