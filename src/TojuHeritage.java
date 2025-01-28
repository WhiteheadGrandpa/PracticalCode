public class TojuHeritage {
    public static class Personality{

        String name;
        String beautiful;
        String profession;
        int age;
        String generalHospital;
        String apapa;

        Personality(String name, String beautiful, String nurse, int age, String generalHospital, String apapa) {
            this.name = name;
            this.beautiful = beautiful;
            this.profession = profession;
            this.age = age;
            this.generalHospital = generalHospital;
            this.apapa = apapa;
        }
        void eat () {
            System.out.println(this.name + " likes food " );
        }
        void drink(){
            System.out.println(this.name + " likes drinking coke");
        }
        void snore(){
            System.out.println(this.name + " snores  alot when sleeping");
        }
        void fart(){
            System.out.println(this.name + " farts alot ");
        }
        void beautiful(){
            System.out.println(this.name + " is a very beautiful woman");
        }
        void profession(){
            System.out.println(this.name + " is a certified nurse");
        }
    }
    public static void main(String[] args) {
        Personality personality = new Personality("Toju Sobanjo", "beautiful", "profession", 38, "generalHospital", "apapa");

        personality.eat();
        personality.drink();
        personality.snore();
        personality.fart();
        personality.beautiful();
        personality.profession();
    }
}
