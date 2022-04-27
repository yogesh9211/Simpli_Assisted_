import java.util.regex.Pattern;
public class RegularExpDemo {
	public static void main(String[] args) {
		System.out.println("Regular expression operation done..");
		String pattern = ".s";
		String input = "yogis";
		System.out.println(Pattern.matches(".s", "yogis"));
		System.out.println();
		System.out.println(Pattern.matches("^(.+)@(.+)$", "yogesh85@gmail.com"));

	}
}