package myApplication4;

import java.util.ArrayList;
import java.util.List;

public class CustomApplicationDAO {

	public static List<CustomApplication> getData() {		  
		List<CustomApplication> list = new ArrayList<CustomApplication>();
		list.add(new CustomApplication("Marky",  "displayName_1"));
		list.add(new CustomApplication("Jhonny", "displayName_2"));
		for(int i=0;i<24;i++) {
			list.add(new CustomApplication("Douglas_"+i, "displayName_3"));
		}
		return list;		  
	}
}
