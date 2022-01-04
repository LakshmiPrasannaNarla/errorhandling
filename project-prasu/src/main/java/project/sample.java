package project;

public class sample {
	public static String welcome(String name) 
	{
		return " welcome to mulesoft"+name;
	}
	public String getBalance(String bankname) {
		if(bankname.equals("HDFC")) {
			return "1000";
		}
		else if(bankname.equals("SBI")){
			return "2000";
		}
		else {
			return "bank doesn't exist";
		}
		
	}
}

		
	


