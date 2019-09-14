public class Magic8 {
  public static void main(String[] args) {
    System.out.println("Magic 8 ball: \n");
    
    int choice = (int) (Math.random() * 9 +1);
    
    switch(choice) {
      case 1:
        System.out.println("Without a doubt");
        break;
      case 2:
        System.out.println("Ask again later");
        break;
      case 3:
        System.out.println("My sources say no");
        break;
      case 4:
        System.out.println("As i see it, yes");
        break;
      case 5:
        System.out.println("Better not tell you now");
        break;
      case 6:
        System.out.println("Don't count on it");
        break;
      case 7:
        System.out.println("Yaaas!");
        break;
      case 8:
        System.out.println("Concentrate and ask again");
        break;
      default:
        System.out.println("Very doubtful");
        break;
    }
  }
}
