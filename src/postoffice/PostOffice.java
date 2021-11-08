
package postoffice;

import letter.RegLetter;
import letter.SimpleLetter;
import parcel.SimpleParcel;
import parcel.SpecialParcel;

public class PostOffice {

    public static void main(String[] args) {
        System.out.println("------------Simple Letters----------");
        SimpleLetter letter1 = new SimpleLetter("Bogura","Cumilla","send");
        letter1.show();
        System.out.println("------------Registered Letters----------");
        RegLetter letter2 = new RegLetter(15.50, "Rongpur","Dhaka","send");
        letter2.show();
        System.out.println("------------Simple Parcels----------");
        SimpleParcel parcel1 = new SimpleParcel("Dhaka", "Borishal", "send", "01767580002", "01308673831");
        parcel1.show();
        System.out.println("------------Special Parcels----------");
        SpecialParcel parcel2 = new SpecialParcel("Khulna", "Feni", "send", "01867589002", "01608673831");
        parcel2.show();
    }
    
}
