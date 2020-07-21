package week5.classnight.staticinstance;

public class StaticInstance {
  void bye() {
    System.out.println("Bye!");
    hi();
  }
  
  static void hi() {
    System.out.println("Hi");
  }
  
  public static void main(String[] args) {
    StaticInstance ins = new StaticInstance();
    ins.bye();
  }
}
