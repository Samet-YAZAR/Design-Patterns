public class TetradName implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Name n) {
        if(n.getNameLenght().length==4) {
            System.out.println("Tetrad Name Person"+ "{ "+ n.getNameLenght()[0] +
                    " "+n.getNameLenght()[1] +" " +
                    n.getNameLenght()[2] +" " +
                    n.getNameLenght()[3] +" }");

        }else {
            System.out.println("5 names is too much sorry :( ");
        }
    }
}

