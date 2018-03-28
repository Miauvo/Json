package L1_enum;

public class TestExample {
    public static void main(String[] args) {
        DogType dogType = DogType.Bobic;

        if(dogType == DogType.Bobic){
            System.out.println("Type - Bobic");
        }

        if (dogType.getValue()==1){
            System.out.println("Type - Bobic");
        }
    }
}
