
package letter;

import common.Letter;

public class RegLetter extends Letter {
    private double extraFee;
    public RegLetter(double extraFee, String senderAdd, String receiverAdd, String status) {
        super(senderAdd, receiverAdd, status);
        this.extraFee = extraFee;
    }
    public void show() {
        super.show();
        System.out.println("Extra fees: " + extraFee);
    }
}
