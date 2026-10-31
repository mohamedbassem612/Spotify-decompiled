package p;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mwn1 extends mh70 {
    public final f1p1 l;

    public mwn1(f1p1 f1p1Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", (byte) 2);
        this.l = f1p1Var;
    }

    @Override // p.mh70
    public final boolean B0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = lon1.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(f4i1.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.l.a(Integer.valueOf(i2));
        return true;
    }
}
