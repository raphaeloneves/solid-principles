package pt.raphaelneves.solidprinciple.liskovsubstitution;

public class LiskovChecker {
    public void verify(SomeClass someClass){
        System.out.println(someClass.getClass().getName());
    }
}
