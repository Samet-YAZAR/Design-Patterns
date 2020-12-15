
public class Subscriber {
    private String name;
    private Channel channel;


    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+ name + " Video Uploaded "+ "the title is \"" + channel.getTitle() + "\"");
    }

    public void sbuscribeChannel(Channel channel){
        this.channel = channel;
    }
}
