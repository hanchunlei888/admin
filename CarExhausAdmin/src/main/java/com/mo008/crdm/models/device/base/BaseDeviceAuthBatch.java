/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.device.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDeviceAuthBatch<M extends BaseDeviceAuthBatch<M>> extends Model<M> implements IBean {

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

	public void setExports(Integer exports) {
		set("exports", exports);
	}

	public Integer getExports() {
		return get("exports");
	}

	public void setOperator(Integer operator) {
		set("operator", operator);
	}

	public Integer getOperator() {
		return get("operator");
	}

	public void setDateline(java.util.Date dateline) {
		set("dateline", dateline);
	}

	public java.util.Date getDateline() {
		return get("dateline");
	}

	public void setDevices(Integer devices) {
		set("devices", devices);
	}

	public Integer getDevices() {
		return get("devices");
	}

	public void setStatus(int status) {
		set("status", status);
	}

	public int getStatus() {
		return get("status");
	}

}