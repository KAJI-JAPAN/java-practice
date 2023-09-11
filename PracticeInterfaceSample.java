
interface Figure {
    int widh ();
    int height();
}

public class PracticeInterfaceSample {
    record Box (int widh, int height) implements Figure {}
    record Oval (int widh, int height) implements Figure {}
}
