import java.util.Scanner;

class Switch {
  public static void main(String[] args) {
    Scanner scannerswitch = new Scanner(System.in);
    System.out.print("Enter input");
    int num = scannerswitch.nextInt();

    switch (num) {
      case 1:
        System.out.println("KP, reg num is", num);
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      default:
        System.out.printf("Your input number %d is not valid", num);
    }
    scannerswitch.close();
  }
}