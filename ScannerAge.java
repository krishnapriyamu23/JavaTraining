import java.util.Scanner;

class ScannerAge {
  public static void main(String[] args) {
    Scanner scannerage = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scannerage.nextInt();
    int x = age;
    scannerage.nextLine();

    if (x < 10) {
      System.out.println("\nChild \n");
    } else if (x > 10) {
      System.out.println("\nAdult\n");
    }
    if (x > 20) {
      System.out.println("\nMajor\n");
    }

    scannerage.close();
  }
}