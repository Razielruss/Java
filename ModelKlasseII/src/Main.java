import java.util.ArrayList;
import java.util.Arrays;

import model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ShoeColor> l_aoShoeColor = new ArrayList<>(
												Arrays.asList(
														new ShoeColor("Blue", 100),
														new ShoeColor("White", 0),
														new ShoeColor("Grey", 100)
														));
		
		l_aoShoeColor.add(new ShoeColor("Yellow", 50));
		
		Shoes l_oShoe = new Shoes("Phantom", "Basketball", 150, l_aoShoeColor);
		
		l_oShoe.showAllAvailableColors();
		System.out.println(l_oShoe.getSumOfColors());
	}

}
