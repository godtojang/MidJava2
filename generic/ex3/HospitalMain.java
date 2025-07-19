package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class HospitalMain {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

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
        Dog biggerDog = dogHospital.bigger(new Dog("개2", 500));
        System.out.println("biggerDog = " + biggerDog);
    }
}
