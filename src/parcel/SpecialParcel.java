
package parcel;

import common.Parcel;

public class SpecialParcel extends Parcel {
    public SpecialParcel(String senderAdd, String recieverAdd, String senderPhn, String recieverPhn, String status) {
        super(senderAdd, recieverAdd, status, senderPhn, recieverPhn);
    }
    public void show() {
        super.show();
    }
}
