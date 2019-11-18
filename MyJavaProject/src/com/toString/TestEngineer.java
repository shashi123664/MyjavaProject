package com.toString;

public class TestEngineer extends Emp {
	String tool;
	TestEngineer()
	{
		
	}
	TestEngineer(int id,String salary,double name,String tool)
	{
		super(id,salary,name);
		this.tool=tool;
	}
	public String toString()
	{
		return super.toString()+"  "+tool;
	}
	public boolean equals(Object ob)
	{
		TestEngineer temp=(TestEngineer)ob;
		return super.equals(ob)  && this.tool==temp.tool;
	}
	public int hashCode()
	{
		int hc=super.hashCode()+tool.hashCode();
		return hc;
	}

}
