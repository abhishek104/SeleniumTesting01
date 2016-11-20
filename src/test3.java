import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {

	public static void main(String[] args) {
		Pattern digitPattern = Pattern.compile("(\\d)"); // EDIT: Increment each digit.

		Matcher matcher = digitPattern.matcher("DKY13");
		StringBuffer result = new StringBuffer();
		while (matcher.find())
		{
		    matcher.appendReplacement(result, String.valueOf(Integer.parseInt(matcher.group(1)) - 1));
		}
		matcher.appendTail(result);
		String ss = result.toString();
		System.out.println("asd:"+ss);

	}

}
