package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRoleMenu<M extends BaseSysRoleMenu<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
	}
	
	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}

	public void setMenuId(java.lang.Long menuId) {
		set("menu_id", menuId);
	}
	
	public java.lang.Long getMenuId() {
		return getLong("menu_id");
	}

}
