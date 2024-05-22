public class Sparrow extends Animal implements Flying{
    @Override
    public void sound() {
        System.out.println("Cip Cip");
    }

    @Override
    public void eat() {
        System.out.println("Seeds");
    }

    @Override
    public void fly(){
        System.out.println("Sto volando");
    }
}
