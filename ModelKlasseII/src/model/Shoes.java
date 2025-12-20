package model;

import java.util.ArrayList;

public class Shoes {
	
	private String m_strName;
	private String m_strType;
	private double m_dPrice;
	private ArrayList<ShoeColor> m_aoShoeColors = new ArrayList<>();
	
	public Shoes() {
		m_strName = "Nike air";
		m_strType = "Basketball";
		m_dPrice = 120;
	}
	
	public Shoes(String p_strName, String p_strType, double p_dprice, ArrayList<ShoeColor> p_aoShoeColors) {
		m_strName = p_strName;
		m_strType = p_strType;
		m_dPrice = p_dprice;
		m_aoShoeColors = p_aoShoeColors;
	}
	
	public String getName() {return m_strName;}
	
	public String getType() {return m_strType;}
	
	public double getPrice() {return m_dPrice;}
	
	public ArrayList<ShoeColor> getShoeColors(){return m_aoShoeColors;}
	
	public void setName(String p_strName) {
		m_strName = p_strName;
	}
	
	public void setType(String p_strType) {
		m_strType = p_strType;
	}
	
	public void setPrice(double p_dPrice) {
		m_dPrice = p_dPrice;
	}
	
	public void setShoeColors(ArrayList<ShoeColor> p_aoShoeColors) {
		m_aoShoeColors = p_aoShoeColors;
	}
	
	public int getSumOfColors() {
		return m_aoShoeColors.size();
	} 
	
	public void showAllColors() {
		
		ShoeColor l_oColor;
		for( int i = 0; i < m_aoShoeColors.size(); i++) {
			l_oColor = m_aoShoeColors.get(i);
			System.out.println(l_oColor.getColor());
		}
	}
	
	public void showAllAvailableColors() {
		
		ShoeColor l_oColor;
		for( int i = 0; i < m_aoShoeColors.size(); i++) {
			l_oColor = m_aoShoeColors.get(i);
			if(l_oColor.getAvailable() == true) {
				System.out.println(l_oColor.getColor());
			}
		}
	}
}
