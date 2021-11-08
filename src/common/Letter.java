package common;

public class Letter extends PostMaterial {
    public Letter(String senderAdd, String receiverAdd, String status) {
        super(senderAdd, receiverAdd, status);
    }
    public void show() {
        super.send();
        super.recieve();
        super.issue();
    }
}
