public class DogMethodName {
  public void getAge() {
    int age = 0;
    age = age + 6;
    System.out.println("Dog's age is :" + age);
  }

  public static void main(String[] args) {
    DogMethodName d = new DogMethodName();
    d.getAge();
  }
}