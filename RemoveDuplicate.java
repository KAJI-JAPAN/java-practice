public class RemoveDuplicate {
  public static void main(String[] args) {
    var data = "abccccbaabcc";
    // var builder = new StringBuilder();

    // for(int i = 0; i < data.length(); i++) {
    //   char ch = data.charAt(i);
    //   if(i > 0 && ch == data.charAt(i - 1)) {
    //     continue;
    //   } 
    //   builder.append(ch);
    // }
    // System.out.println(data);
    // System.out.println(builder);

    // char prev = 0;
    // var builder = new StringBuilder();
    // for(char ch: data.toCharArray()) {
    //   if(ch == prev) {
    //     continue;
    //   }
    //   builder.append(ch);
    //   prev = ch;
    // }
    
    char[] chars = data.toCharArray();
    for(int i = 0; i < data.length() - 1 ; i += 2 ) {
      char tmp = chars[i];
      chars[i] = chars[i  + 1 ];
      chars[i + 1] = tmp;
    }
    System.out.println(chars);
  }
}
