package L1_enum;

public enum DogType {
    Bobooc(0),
    Sharic(1),
    Bobic(2);

    private final int value;
    DogType(final int newValue){
        value =  newValue;
    }
    public int getValue(){
        return value;
    }

}
