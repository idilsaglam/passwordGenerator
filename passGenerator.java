import java.util.Random;

public class passGenerator{
    public static char[] generatePass(int length){
	String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	String specialCharacters = "!@#$&/";
	String numbers = "1234567890";
	String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	Random random = new Random();
	char[] password = new char[length];
	
	for(int i=0; i<length; i++){
	    password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	}
	return password;
    }
    
    public static void main(String[] args){
	System.out.println(generatePass(8));
    } 


}
