package week5.classnight.palindrome;

public class Palindrome {
  // mom moom
  public static void main(String[] args) {
    String test = "A man, a plan, a canal - Panama";
    String testNoSpace = test.replace(" ", "").replace(",", "").replace("-", "").toLowerCase();
    StringBuilder reverse = new StringBuilder(testNoSpace).reverse();
    
    if(reverse.toString().equals(testNoSpace)) {
      System.out.println("'" + test + "' is a palindrome!");
    }
    else {
      System.out.println("'" + test + "' is not a palindrome!");
    }
  }
}
