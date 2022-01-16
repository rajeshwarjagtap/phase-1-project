package first;
import java.util.regex.*;
 public class regularExpnAssisted {

	public static void main(String[] args) {

	String pattern="[A-Z]+";

	String check="Hello World Hello Java ";

	Pattern p= Pattern.compile(pattern); Matcher c=p.matcher(check);

	while (c.find())

	System.out.println( check.substring( c.start(), c.end()));

}
}