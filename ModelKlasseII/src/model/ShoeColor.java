package model;

public class ShoeColor {

	private String m_strColor;
	private boolean m_bAvailable;
	private int m_iStock;
	
	public ShoeColor(String p_strColor, int p_iStock) {
		m_strColor = p_strColor;
		m_iStock = p_iStock;
				
		if(m_iStock > 0) {
			m_bAvailable = true;
		}
		else {
			m_bAvailable = false;
		}
	}
	
	public String getColor() {return m_strColor;}
	
	public int getStock() {return m_iStock;}
	
	public boolean getAvailable() {return m_bAvailable;}
	
	public void setColor(String p_strColor) {m_strColor = p_strColor ;}
	
	public void setStock(int p_iStock) {m_iStock = p_iStock ;}
	
	public void setAvailable(boolean p_bAvailable) {m_bAvailable = p_bAvailable;}
	
}
