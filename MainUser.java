public class MainUser {
  public static void main(String[] args) {

    int[] marks;
    int[][] dArray = new int[11][60];

    // marks = new int[10];

    // boolean referal = true;
    // User user1 = new User("Employee");
    // user1.getPoints();

    // int marks = { 10, 20, 30, 40, 50 };
    for (int i = 1; i < 11; i++) {
      int j = 5;
      {
        dArray[i][j] = i * j;
      }
    }
    for (int i = 1; i < 11; i++) {
      int j = 5;
      {
        System.out.println(dArray[i][j]);
      }
    }
  }
}