public class DoubleName implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Name n) {
        if(n.getNameLenght().length==2) {
            System.out.println("Double Name Person"+ "{ "+ n.getNameLenght()[0] + " "+n.getNameLenght()[1]  +" }");

        }else {
            nextInChain.process(n);
        }
    }
}
