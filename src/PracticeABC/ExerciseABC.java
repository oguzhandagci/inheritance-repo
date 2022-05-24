package PracticeABC;

public class ExerciseABC {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        System.out.println("\n------ ------\n");

        C c1 = new C();

        c1.a();
        c1.b();
        c1.c();

    }
}