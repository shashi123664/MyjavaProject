package com.toString;
class Developer extends Emp{

String tool;
String language;
Developer()
{
	
}
Developer(int id,String salary,double name,String language)
{
	super(id,salary,name);
	this.language=language;
}
public String toString()
{
	return super.toString()+"  "+language;
}
public boolean equals(Object ob)
{
	Developer temp=(Developer)ob;
	return super.equals(ob) && this.language==temp.language;
}
public int hashCode()
{
	int hc=super.hashCode()+language.hashCode();
	return hc;
}

}