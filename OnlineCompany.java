public class OnlineCompany extends Company
{
	private String webAddress;

	// An online company's address is its webaddress
	public OnlineCompany(String name, String webAddress)
	{
		super(name);
		this.webAddress = webAddress;
	}

	public String address()
	{
		return webAddress;
	}

	public String toString()
	{
		return super.getName() + "\n" + webAddress;
	}
}
