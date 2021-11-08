
package common;

public class Parcel extends PostMaterial {
    protected String senderPhn, recieverPhn;
    public Parcel(String senderAdd, String receiverAdd, String recieverPhn, String status, String senderPhn) {
        super(senderAdd, receiverAdd, status);
        this.recieverPhn = recieverPhn;
        this.senderPhn = senderPhn;
    }
    public void show() {
        System.out.println("Reciever phone number: " + recieverPhn + "\nSender phone number: " + senderPhn);
        super.send();
        super.recieve();
        super.issue();
    }
}
