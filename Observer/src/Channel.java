import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subs = new ArrayList<>();
    private String title; //that video needs to have a title as well.

    public void subsribe(Subscriber sub) {
        subs.add(sub);
    }
    public void unSubscriber (Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscribers(){
        for (Subscriber sub : subs ) {
            sub.update();
        }
    }
    public void upload(String title){ //if uploading happens notify subscribers
        this.title= title;
        notifySubscribers();
    }

    public String getTitle() {
        return title;
    }
}
