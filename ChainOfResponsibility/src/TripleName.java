public class TripleName implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Name n) {
        if(n.getNameLenght().length==3) {
            System.out.println("Triple Name Person"+ "{ "+ n.getNameLenght()[0] +
                    " "+n.getNameLenght()[1] +" " +
                    n.getNameLenght()[2] +" }");

        }else {
            nextInChain.process(n);
        }
    }
}
