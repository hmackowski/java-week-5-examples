package week5.classnight.acccess;

public class Accessible {
  public void publicMethod() {
    System.out.println("Hi from public");
  }
  
  private void privateMethod() {
    System.out.println("Private");
  }
  
  void packageAccess() {
    System.out.println("package!");
  }
  
  protected void protectedAccess() {
    System.out.println("protected");
  }
  
  public static void main(String[] args) {
    new Accessible().publicMethod();
    new Accessible().privateMethod();
    new Accessible().packageAccess();
    new Accessible().protectedAccess();
  }
}
