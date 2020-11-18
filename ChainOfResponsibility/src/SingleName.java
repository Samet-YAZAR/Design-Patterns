public class SingleName implements Chain {
    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Name n) {
        if(n.getNameLenght().length==1) {
            System.out.println("Single Name Person"+ "{ "+ n.getNameLenght()[0] + " }");

        }else {
            nextInChain.process(n);
        }
    }
}
