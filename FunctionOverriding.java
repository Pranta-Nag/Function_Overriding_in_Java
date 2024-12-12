class Animal {
    void name(){
        System.out.println("The animal is Tiger");
    }
}

class Tiger extends Animal {
    @Override
    //overriding
    void name(){
        System.out.println("The tiger name is Newton");
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name();

        Tiger tiger = new Tiger();
        tiger.name();
    }
}