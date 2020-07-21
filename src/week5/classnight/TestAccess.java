package week5.classnight;

import week5.classnight.acccess.Accessible;

public class TestAccess extends Accessible {
  private void callingProtected() {
    protectedAccess();
  }
  
  public static void main(String[] args) {
    new TestAccess().callingProtected();
    new TestAccess().publicMethod();
  }
}
