package project;

public class sales {
	public class Sales {
		public String checkProductid(int productid)
		{
		if(productid>=10001 && productid<=99999)
		return "Valid";
		else
		return "Invalid";
		}
		public String getAmount(String getamount) {
		if(getamount.equals("S")) {
		return "$30";
		}
		else if(getamount.equals("M")) {
		return "50$";
		}
		else {
		return "80$";
		}
		}
		}
}
	