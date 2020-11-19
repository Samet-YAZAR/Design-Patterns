import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public abstract class MyLibrary {

     public final void processBook() {
        boolean addNote;

        //Template for subclass to follow
        //Step 1 = Open a book
        //Step 2 = Read a book or
        //Step 3 = Write a note
        //Step 4 = Save a note, if 3 executed
        //Step 5 = close a book

        //conditional template
        openBook();

        if (addNote = userWantstoAddNote()) {
            writeNote();
        } else {
            readBook();
        }

        if(addNote){
            saveNote();
        }


        closeBook();
    }

    private boolean userWantstoAddNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to write a note (y/n) ? ");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }
    public abstract void readBook();
    public abstract void writeNote();

    public void openBook() {
        System.out.println("Opening the book...");
    }

    public void closeBook() {
        System.out.println("Closing the book...");
    }
    public void saveNote() {
        System.out.println("Saving the Note...");
    }


}
