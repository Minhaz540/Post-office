
package parcel;

import common.Parcel;

public class SimpleParcel extends Parcel {
    public SimpleParcel(String senderAdd, String recieverAdd, String senderPhn, String recieverPhn, String status) {
        super(senderAdd, recieverAdd, status, senderPhn, recieverPhn);
    }
    public void show() {
        super.show();
    }
}
