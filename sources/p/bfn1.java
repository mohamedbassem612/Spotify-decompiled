package p;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bfn1 extends mh70 implements qfn1 {
    public bfn1() {
        super("com.google.android.gms.cast.internal.IBundleCallback", (byte) 3);
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) osn1.a(parcel, Bundle.CREATOR);
        osn1.a(parcel, hi5.CREATOR);
        osn1.d(parcel);
        D0(bundle);
        return true;
    }
}
