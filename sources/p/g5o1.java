package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g5o1 extends mh70 {
    public final np5 l;

    public g5o1(np5 np5Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy", (byte) 11);
        this.l = np5Var;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.l);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = drn1.a;
        Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
        long j = parcel.readLong();
        drn1.c(parcel);
        this.l.b(j, string, string2, (Bundle) parcelable);
        parcel2.writeNoException();
        return true;
    }
}
