package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHopitalMain3 {

    public static void main(String[] args) {
        AnimalHospital3<Dog> dogHospital = new AnimalHospital3<>();
        AnimalHospital3<Cat> catHospital = new AnimalHospital3<>();

        Dog dog = new Dog("멍멍이1" , 100);
        Cat cat = new Cat("냐옹이1" , 300);
        
        //개병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        
        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();
        
        // 문제 : 1 개병원에 고양이 를 전달 
        //dogHospital.set(cat);  //다른 타입 입력
        
        //문제 : 2 개타입 변환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
