public class DogBreed {

    String black = " Bulldog ";
    String white = " Rotweiller";
    String red = " Pitbull";

    void barking(){
        System.out.println("Bulldogs are very aggressive");
    }
    void eating(){
        System.out.println("Pitbull are too wild");
    }

    public static void main(String[] args) {
        DogBreed dogBreed = new DogBreed();
        System.out.println("DogBreed" + dogBreed.black);
        System.out.println("DogBreed" + dogBreed.white);
        System.out.println("DogBreed" + dogBreed.red);

        dogBreed.barking();
        dogBreed.eating();

    }
}
