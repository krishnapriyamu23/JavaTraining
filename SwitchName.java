import java.util.Scanner;

public class SwitchName {
  public static void main(String[] args) {
    Scanner studentswitch = new Scanner(System.in);
    System.out.println("Enter roll num ");
    int rollNum = studentswitch.nextInt();

    switch (rollNum) {
      case 1:
        System.out.printf("KP, roll num is %d", rollNum);
        break;
      case 2:
        System.out.printf("Marion, roll num is %d", rollNum);
        break;
      case 3:
        System.out.printf("Preetha, roll num is %d", rollNum);
        break;
      case 4:
        System.out.printf("Soubin, roll num is %d", rollNum);
        break;
      case 5:
        System.out.printf("Sreekkuty, roll num is %d", rollNum);
        break;
      default:
        System.out.printf("Your roll number %d is not valid", rollNum);
    }
    studentswitch.close();

  }
}