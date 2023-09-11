import java.util.List;

interface Named {
    String name();
}

public class InterfaceSample {
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    public static void main(String[] args) {
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"), new Passenger());
        for(Named p : people) {
            var n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }

    static class Passenger implements Named {
        @Override
        public String name() {
            return "通りすがり";
        }
    }
}
