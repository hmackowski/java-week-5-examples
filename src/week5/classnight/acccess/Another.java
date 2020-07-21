package week5.classnight.acccess;

public class Another {
  public static void main(String[] args) {
    new Accessible().publicMethod();
//    new Accessible().privateMethod();
    new Accessible().packageAccess();
    new Accessible().protectedAccess();
  }
}
