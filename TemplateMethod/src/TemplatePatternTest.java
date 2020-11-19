public class TemplatePatternTest {
    public static void main(String[] args) {
        MyLibrary spiderMan = new SpiderMan();
        spiderMan.processBook();


        System.out.println("**************************");

        MyLibrary hobbit = new Hobbit();
        hobbit.processBook();
    }
}
