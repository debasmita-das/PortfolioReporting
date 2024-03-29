package com.pojo;

public class SecurityType {

	private int typeId;
	private String typeName;
	public SecurityType(int typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "SecurityType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
	
}
