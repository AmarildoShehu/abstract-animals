public class Delfin extends Animal implements  Swimmer{

    @Override
    public void sound() {
        System.out.println("Click");
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void swim(){
        System.out.println("Sto nuotando");
    }
}
