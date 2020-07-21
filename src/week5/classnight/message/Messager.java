package week5.classnight.message;

public class Messager {
  interface Message {
    void message(String message);
    void howdy(String message);
  }
  
  class StarMessage implements Message {
    @Override
    public void message(String message) {
      // ***message***
      System.out.println(formatMessage(message));
    }
    private String formatMessage(String message) {
      return "***" + message + "***";
    }
    @Override
    public void howdy(String message) {
      String formatted = formatMessage(message);
//      String stars = "*".repeat(formatted.length());
      String stars = "";
      
      for(int index = 0; index < formatted.length(); index++) {
        stars += "*";
      }
      
      System.out.println(stars);
      System.out.println(formatted);
      System.out.println(stars);
    }
  }
  
  class SpaceMessage implements Message {
    @Override
    public void message(String message) {
      // m e s s a g e
      System.out.println(formatMessage(message));
    }
    String formatMessage(String message) {
      StringBuilder builder = new StringBuilder();
      
      for(int index = 0; index < message.length(); index++) {
        builder.append(message.charAt(index)).append(" ");
      }
      
      return builder.toString();
    }
    @Override
    public void howdy(String message) {
      // Howdy: m e s s a g e
      System.out.println("Howdy: " + formatMessage(message));
    }
    
  }

  void run() {
//    StarMessage star = new StarMessage();
//    star.message("My message");
//    star.howdy("Howdy there!");
    
    SpaceMessage space = new SpaceMessage();
    space.message("Space message!");
    space.howdy("Howdy from space!");
  }

  public static void main(String[] args) {
    new Messager().run();
  }
}
