import java.util.ArrayList;
import java.util.List;

public class  Exercises {
  public static void main(String[] args) {
    var fruitsList = List.of("banana", "apple", "grape");
    var result = new ArrayList<String>();
    var resultCount = 0;
    boolean allContainP = true;
    boolean eitherOneContainP = false;
    for(var fruits : fruitsList) {
      if(fruits.length() == 5) {
        result.add(fruits);
        resultCount++;
        if(!fruits.contains("p")) {
          allContainP=false;
        }
        if(fruits.contains("p")) {
          eitherOneContainP = true;
        }
      }
    }
    
    System.out.println("フルーツが5文字丁度の新しいリスト：　" + result);
    System.out.println("フルーツが5文字丁度の数：　" + resultCount);
    System.out.println("フルーツが5文字丁度の数がpを含むか：　" + allContainP);
    System.out.println("フルーツが5文字丁度の数のどちらか1つでもpを含むか：　" + eitherOneContainP);
  }
}
