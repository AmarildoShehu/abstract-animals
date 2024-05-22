public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal sparrow = new Sparrow();
        Animal eagle = new Eagle();
        Animal delfin = new Delfin();

        dog.sleep();
        dog.sound();
        dog.eat();

        sparrow.sleep();
        sparrow.sound();
        sparrow.eat();

        eagle.sleep();
        eagle.sound();
        eagle.eat();

        delfin.sleep();
        delfin.sound();
        delfin.eat();

        Util.makeFly((Flying) sparrow) ;
        Util.makeFly((Flying) eagle);
        Util.makeSwim((Swimmer) delfin);
    }
}
