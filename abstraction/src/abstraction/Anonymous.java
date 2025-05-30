package abstraction;

abstract class Plane {
    void fly() {
        System.out.println("Plane is ready to fly");
    }

    abstract int num();
    abstract void name();

    void go() {
        System.out.println("Signal to fly");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Plane c = new Plane() {
            int passengers =56;

            int num() {
                return passengers;
            }

            void name() {
                System.out.println("IndiGo");
            }

			
        };

        c.name();
        System.out.println("Number of passengers: " + c.num());
        c.fly();
        c.go();
    }
}
