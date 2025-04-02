public class CompanyTester
{
	public static void run()
	{
		Company myCompany = new Company("Danny's Stuff", "14356 GoldenwestSt", "Westminster", "CA");
		System.out.println(myCompany.getName());
		System.out.println(myCompany.address());
		System.out.println(myCompany);

		OnlineCompany myOnlineCompany = new OnlineCompany("Danny's Online Stuff", "www.icannotaffordabetterdomainname");
		System.out.println(myOnlineCompany.getName());
		System.out.println(myOnlineCompany.address());
		System.out.println(myOnlineCompany);
	}
}
