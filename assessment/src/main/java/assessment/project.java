package assessment;

public class project {
	public String getproductid(int productid)
	{
	if(productid>=10001 && productid<=99999)
	return "valid";
	else
	return "invalid";
	}
	public String getamount(String size) {
	if(size.equals("S")) {
	return "$30";
	}
	else if(size.equals("M")) {
	return "50$";
	}
	else {
	return "80$";
	}
	}
	}

