public class Name {
    private String[] nameLenght;

    public Name(String n){
        nameLenght = n.split(" ");

    }

    public String[] getNameLenght() {
        return nameLenght;
    }
}
