package OOPS;

public class OOPSTesting {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.think();
    }
}

final class FinalClass {
    void think() {
        System.out.println("Thinking...");
    }
}
