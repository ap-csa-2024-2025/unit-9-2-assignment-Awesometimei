import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Dog d1 = new Dog("Dog");
    Dog d2 = new LoudDog("Loud Dog");
    System.out.println(d1);
    System.out.println(d2);
    CarTester.run();
    CompanyTester.run();
  }
}
