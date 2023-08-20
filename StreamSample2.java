import java.util.List;


public class StreamSample2 {
  public static void main(String[] args) {
    var data = List.of("yamamoto", "sugiyama", "kis");
    var result = 0;
    for (var s : data) {
      if( s.length() >= 5 ) {
        result++;
      }
    }
    System.out.println(result);
  }
}
