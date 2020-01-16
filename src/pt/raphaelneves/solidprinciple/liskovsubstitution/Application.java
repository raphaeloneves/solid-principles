package pt.raphaelneves.solidprinciple.liskovsubstitution;

public class Application {
    public static void main(String[] args) {
        LiskovChecker checker = new LiskovChecker();

        SomeClass someClass = new SomeClass(); // BASE CLASS
        SomeClass anotherClass = new AnotherClass(); // DERIVED CLASS
        SomeClass awesomeClass = new AwesomeClass(); // DERIVED CLASS

        checker.verify(someClass);
        checker.verify(anotherClass);
        checker.verify(awesomeClass);
    }
}
