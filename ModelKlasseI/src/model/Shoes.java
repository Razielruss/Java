package model;

public class Shoes {
	
	private String m_strName;
	private String m_strType;
	private double m_dPrice;
	
	public Shoes() {
		m_strName = "Nike air";
		m_strType = "Basketball";
		m_dPrice = 120;
	}
	
	public Shoes(String p_strName, String p_strType, double p_dprice) {
		m_strName = p_strName;
		m_strType = p_strType;
		m_dPrice = p_dprice;
	}
	
	public String getName() {return m_strName;}
	
	public String getType() {return m_strType;}
	
	public double getPrice() {return m_dPrice;}
	
	public void setName(String p_strName) {
		m_strName = p_strName;
	}
	
	public void setType(String p_strType) {
		m_strType = p_strType;
	}
	
	public void setPrice(double p_dPrice) {
		m_dPrice = p_dPrice;
	}
}
