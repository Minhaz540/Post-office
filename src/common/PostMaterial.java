
package common;

public class PostMaterial {
    protected String senderAdd, recieverAdd, status;
    public PostMaterial(String senderAdd, String receiverAdd, String status) {
        this.recieverAdd = receiverAdd;
        this.senderAdd = senderAdd;
        this.status = status;
    }
    public void issue() {
        System.out.println("Status: "+status);
    }
    public void send() {
        System.out.println("Sender address: "+senderAdd);
    }
    public void recieve() {
        System.out.println("Reciever address: " + recieverAdd);
    }
}
