package com.mo008.crdm.models.supplier.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSupplier<M extends BaseSupplier<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setCode(String code) {
		set("code", code);
	}

	public String getCode() {
		return get("code");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setStatus(Boolean status) {
		set("status", status);
	}

	public Boolean getStatus() {
		return get("status");
	}

	public void setSort(Integer sort) {
		set("sort", sort);
	}

	public Integer getSort() {
		return get("sort");
	}
	public void setCars(String cars) {
		set("cars", cars);
	}

	public String getCars() {
		return get("cars");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setCreater(Integer creater) {
		set("creater", creater);
	}

	public Integer getCreater() {
		return get("creater");
	}

	public void setUpdater(Integer updater) {
		set("updater", updater);
	}

	public Integer getUpdater() {
		return get("updater");
	}

	public void setDeleteFlag(Boolean deleteFlag) {
		set("delete_flag", deleteFlag);
	}

	public Boolean getDeleteFlag() {
		return get("delete_flag");
	}

}