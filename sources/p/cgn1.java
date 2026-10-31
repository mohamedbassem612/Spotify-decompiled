package p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cgn1 extends y9n1 {
    public cgn1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController", (byte) 1);
    }

    public final void g1(hi5 hi5Var) {
        Parcel parcelA1 = a1();
        osn1.b(parcelA1, hi5Var);
        d1(17, parcelA1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h1(mgn1 mgn1Var, hi5 hi5Var) {
        Parcel parcelA1 = a1();
        osn1.c(parcelA1, mgn1Var);
        osn1.b(parcelA1, hi5Var);
        d1(18, parcelA1);
    }
}
