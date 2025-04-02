public class LoudDog extends Dog
{

	public LoudDog(String name)
	{
	 super(name);
	}

	public String speak()
	{
		return "BARK!";
	}
	
	public String toString()
	{
		return super.getName() + " likes to " + speak();
	}
}
