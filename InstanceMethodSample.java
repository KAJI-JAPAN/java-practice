public class InstanceMethodSample {
  record Student(String name, int englishScore, int mathScore) {
    int average() {
      return (englishScore() + mathScore()) / 2;
    }
    String showResult(int score) {
      return "%sさんの平均点は%dです".formatted(name,  score);
    }
  }

  public static void main(String[] args) {
    var kis = new Student("kis", 69, 50);
    var a = kis.average();
    System.out.println(kis.showResult(a));
  }

  boolean check (String a) {
    return a.contains("y");
  }

 String upper (String a ) {
  return a.toUpperCase();
 }
 boolean empty (String s) {
  return s.isEmpty();
 }
}
