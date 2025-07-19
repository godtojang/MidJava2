package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class HospitalMain2 {
    public static void main(String[] args) {
        AnimalHospital dogHospital = new AnimalHospital();
        AnimalHospital catHospital = new AnimalHospital();

        Dog dog = new Dog("개1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();
        
        // 개 병원에 고양이 전달
//        dogHospital.set(cat);

        // 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("개2", 500));
        System.out.println("biggerDog = " + biggerDog);
    }
}
