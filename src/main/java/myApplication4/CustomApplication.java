package myApplication4;


public class CustomApplication {
	//fields must be public
  
	public String name;
  
	public String displayName;	
	
	public CustomApplication(String name,String displayName) {
		this.name = name;
		this.displayName = displayName;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
}
