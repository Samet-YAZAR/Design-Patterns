import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private ArrayList<Memento> history;
    private int lastMemory = -1;

    public CareTaker() { // Each time we call this class, arraylist is created.
        this.history = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.history.add(memento);
        lastMemory = this.history.size() - 1; //last index is our place always.
    }

    public Memento getMemento(int index) {
        return history.get(index);
    }

    public Memento undo() {
        System.out.println("Undoing Memento..");
        if (lastMemory <= 0) {
            lastMemory = 0;
            return history.get(0); //if it is 0th index, then --lastMemory doesn't work, get error.
        }
        lastMemory--;
        return history.get(lastMemory); //else case covers that lastMemory is equals -1, so at least return 0th element.
    }

    public Memento redo() {
        System.out.println("Redoing Memento...");
        if (lastMemory >= history.size() - 1) {
            lastMemory = history.size() - 1; // assign length [last index] to the variable
            return history.get(lastMemory);
        }
        return history.get(++lastMemory); //this is acceptable because in this case, we increment value from -1 to 0.
    }

    public int getLastMemory() {
        return lastMemory;
    }
}
