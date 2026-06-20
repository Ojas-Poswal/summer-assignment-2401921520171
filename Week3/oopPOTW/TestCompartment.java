package Week3.oopPOTW;

abstract class Compartment {
    abstract void notice();
}
class FirstClass extends Compartment{
    void notice(){
        System.out.println("This is a First Class Compartment");
    }
}
class Ladies extends Compartment{
    void notice(){
        System.out.println("This is a Ladies Compartment");
    }
}
class General extends Compartment{
    void notice(){
        System.out.println("This is a General Compartment");
    }
}
class Luggage extends Compartment{
    void notice(){
        System.out.println("This is a Luggage Compartment");
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment c[] = new Compartment[10];
        for(int i=0;i<10;i++){
            int rand = (int)(Math.random()*4);
            switch(rand){
                case 0:
                    c[i] = new FirstClass();
                    break;
                case 1:
                    c[i] = new Ladies();
                    break;
                case 2:
                    c[i] = new General();
                    break;
                case 3:
                    c[i] = new Luggage();
                    break;
            }
        }
        for(int i=0;i<10;i++){
            c[i].notice();
        }
    }
}
