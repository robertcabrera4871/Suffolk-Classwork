package compareObjects;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country>{
	
	public int compare(Country arg0, Country arg1) {
		//return arg0.getName().compareTo(arg1.getName());
		return Double.compare(arg0.getArea(), arg1.getArea());
	}

}
