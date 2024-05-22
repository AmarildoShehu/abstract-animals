public class Eagle extends Animal implements Flying{
    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Flesh");
    }

    @Override
    public void fly(){
        System.out.println("Sto volando");
    }
}
