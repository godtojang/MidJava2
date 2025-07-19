package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));
        WildCardEx WildcardEx;
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);
        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
    }

}
