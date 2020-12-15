public class Youtube {
    public static void main(String[] args) {
        //Here is main -endpoint and there is no logic here.

        Channel bebarBilim = new Channel();
        Subscriber s1 = new Subscriber("Samet");
        Subscriber s2 = new Subscriber("Salih");
        Subscriber s3 = new Subscriber("Ahmet");
        Subscriber s4 = new Subscriber("Fatma");
        Subscriber s5 = new Subscriber("Ali");

        bebarBilim.subsribe(s1);
        bebarBilim.subsribe(s2);
        bebarBilim.subsribe(s3);
        bebarBilim.subsribe(s4);
        bebarBilim.subsribe(s5);

        s1.sbuscribeChannel(bebarBilim);
        s2.sbuscribeChannel(bebarBilim);
        s3.sbuscribeChannel(bebarBilim);
        s4.sbuscribeChannel(bebarBilim);
        s5.sbuscribeChannel(bebarBilim);

        bebarBilim.upload("Everything About Quantum");

    }

}
