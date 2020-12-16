public class Main {

    public static void main(String[] args) {


        Originator originator = new Originator();
        CareTaker careTaker= new CareTaker();

        originator.restore(careTaker.redo());
        printMemento(originator);

        originator.setArticle("First Day in School");
        careTaker.addMemento(originator.save());
        printMemento(originator);



        originator.setArticle("First Day in University");
        careTaker.addMemento(originator.save());
        printMemento(originator);

        originator.restore(careTaker.undo());
        printMemento(originator);




        originator.setArticle("First Day in Abroad");
        careTaker.addMemento(originator.save());
        printMemento(originator);

        originator.setArticle("First Day in English Class");
        careTaker.addMemento(originator.save());
        printMemento(originator);


        originator.restore(careTaker.undo());
        originator.restore(careTaker.undo());
        originator.restore(careTaker.undo());

        printMemento(originator);


    }
    public static void printMemento(Originator o){
        System.out.println("Current state : " + o.getArticle());
    }
}
