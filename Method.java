public class Method
{
public static void main(String[] args)
{
	System.out.println("Print email and PL");
	printEmail("anitavn022@gmail.com");
	printEmail("anitavn.xworkz@gmail.com");
	printEmail("sunitanaragund98@gmail.com");
	
	
	System.out.println("....................");
	programmingLanguage("JAVA");
	programmingLanguage("HTML");
	programmingLanguage("PHP");

}
public static void printEmail(String email)
{
	System.out.println("printEmail:"+ email);
}
public static void programmingLanguage(String programmingLanguage){
	System.out.println("programmingLanguage:"+programmingLanguage);
}
}