public class Main {

    public static void main(String[] args) {

        Chain n1 = new SingleName();
        Chain n2 = new DoubleName();
        Chain n3 = new TripleName();

        n1.setNext(n2);
        n2.setNext(n3);

        n1.process(new Name("Samet"));
        n2.process(new Name("Samet Salih"));
        n3.process(new Name("Samet Salih Ahmet"));
        n1.process(new Name("Samet"));

    }


}
