import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args){    //Implementation of method and String
        String s1 = "Yogesh85@gmail.com";
        String s2 = "yogeshgamil.com";
        String s3 = "";

        System.out.println("s1 = " + validateEmail(s1));
        System.out.println("s2 = " + validateEmail(s2));
        System.out.println("s3 = " + validateEmail(s3));
    }
    public static String validateEmail(String email){
    
		if (email == null || email.isEmpty()){
            return "Please Enter Email Id";
        }
        String emailRegx = "^(.+)@(.+)$";       //Implementation of RegularExp
       
		Pattern pattern = Pattern.compile(emailRegx);
        if (pattern.matcher(email).matches()){
            return "Email id Entered is Valid";
        }
        else{
            return "Email id Entered Invalid";
        }
        }
}
