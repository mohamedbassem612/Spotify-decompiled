package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.ContentDistributionModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vjn1 extends y9n1 implements lln1 {
    public final int g1(int i, Bundle bundle, String str, String str2) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(i);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        int i2 = lon1.a;
        parcelE1.writeInt(1);
        bundle.writeToParcel(parcelE1, 0);
        Parcel parcelF1 = f1(10, parcelE1);
        int i3 = parcelF1.readInt();
        parcelF1.recycle();
        return i3;
    }

    public final Bundle h1(String str, String str2, String str3) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(3);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        parcelE1.writeString(str3);
        parcelE1.writeString(null);
        Parcel parcelF1 = f1(3, parcelE1);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) lon1.a(parcelF1);
        parcelF1.recycle();
        return bundle;
    }

    public final Bundle i1(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(i);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        parcelE1.writeString(str3);
        parcelE1.writeString(null);
        int i2 = lon1.a;
        parcelE1.writeInt(1);
        bundle.writeToParcel(parcelE1, 0);
        Parcel parcelF1 = f1(8, parcelE1);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) lon1.a(parcelF1);
        parcelF1.recycle();
        return bundle2;
    }

    public final Bundle j1(String str, String str2, String str3) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(3);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        parcelE1.writeString(str3);
        Parcel parcelF1 = f1(4, parcelE1);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) lon1.a(parcelF1);
        parcelF1.recycle();
        return bundle;
    }

    public final Bundle k1(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(i);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        parcelE1.writeString(str3);
        int i2 = lon1.a;
        parcelE1.writeInt(1);
        bundle.writeToParcel(parcelE1, 0);
        Parcel parcelF1 = f1(11, parcelE1);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) lon1.a(parcelF1);
        parcelF1.recycle();
        return bundle2;
    }

    public final Bundle l1(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(i);
        parcelE1.writeString(str);
        parcelE1.writeString(str2);
        int i2 = lon1.a;
        parcelE1.writeInt(1);
        bundle.writeToParcel(parcelE1, 0);
        parcelE1.writeInt(1);
        bundle2.writeToParcel(parcelE1, 0);
        Parcel parcelF1 = f1(ContentDistributionModel.TV_AND_ONLINE, parcelE1);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) lon1.a(parcelF1);
        parcelF1.recycle();
        return bundle3;
    }

    public final void m1(String str, Bundle bundle, mtn1 mtn1Var) {
        Parcel parcelE1 = e1();
        parcelE1.writeInt(18);
        parcelE1.writeString(str);
        int i = lon1.a;
        parcelE1.writeInt(1);
        bundle.writeToParcel(parcelE1, 0);
        parcelE1.writeStrongBinder(mtn1Var);
        Parcel parcelObtain = Parcel.obtain();
        try {
            ((y9n1) this).l.transact(1301, parcelE1, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelE1.recycle();
            parcelObtain.recycle();
        }
    }
}
