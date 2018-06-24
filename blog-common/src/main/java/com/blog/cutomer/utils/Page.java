package com.blog.cutomer.utils;

import java.util.List;

/**
 * 分页对象
 * @author lifeng
 *
 */
public class Page<T> {

	//数据
	private List<T> datas;
	
	//总条数
	private int totalsize;
	
	//页码
	private int pageno;
	
	//每页条数
	private int pagesize;
	
	//总页码
	private int totalno;
	
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public int getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(int totalsize) {
		this.totalsize = totalsize;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalno() {
		return totalno;
	}
	public void setTotalno(int totalno) {
		this.totalno = totalno;
	}
	@Override
	public String toString() {
		return "Page [datas=" + datas + ", totalsize=" + totalsize + ", pageno=" + pageno + ", pagesize=" + pagesize
				+ ", totalno=" + totalno + ", getDatas()=" + getDatas() + ", getTotalsize()=" + getTotalsize()
				+ ", getPageno()=" + getPageno() + ", getPagesize()=" + getPagesize() + ", getTotalno()=" + getTotalno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
