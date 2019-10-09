package Bilski.Kajetan.testapp;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Adder adder;
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        adder = new Adder();
        System.out.println(adder.add(scanner.nextInt(),scanner.nextInt()));
        scanner.close();
    }
}
