public class Main {
  public static void main(String[] args) {

    System.out.println(Bankk.printName());
    Bankk marion = new Bankk();
    Bankk priya = new Bankk();

    System.out.println(marion.checkBalance());
    System.out.println(priya.checkBalance());

    marion.deposit(100L);
    priya.deposit(200L);

    System.out.println("--------after deploist--------");
    System.out.println(marion.checkBalance());
    System.out.println(priya.checkBalance());

    marion.withdraw(25, "Savings");
    priya.withdraw(30, "Savings");
    priya.withdraw(30, "Savings");
    marion.withdraw(1, "Savings");
    marion.withdraw(2, "Savings");
    marion.withdraw(3, "Savings");

    marion.withdraw(300000, "Current");
    priya.withdraw(30, "UPI");

    System.out.println("--------after withdraw--------");
    System.out.println("Marion  = " + marion.checkBalance());
    System.out.println("Krishna Priya balance = " + priya.checkBalance());

  }

}
