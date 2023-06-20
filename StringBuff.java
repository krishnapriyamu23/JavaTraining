public class StringBuff {
  public static void main(String[] args) {
    StringBuffer name = new StringBuffer("Krishna ");
    name.append("Priya");
    name.insert(3, "Anu");
    name.replace(2, 3, "Hello");
    name.delete(6, 10);
    System.out.println(name);
  }
}