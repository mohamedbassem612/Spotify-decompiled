package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xxn1 extends mh70 {
    public xaa l;
    public final int m;

    public xxn1(xaa xaaVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 4);
        this.l = xaaVar;
        this.m = i;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.m;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) psn1.a(parcel, Bundle.CREATOR);
            psn1.c(parcel);
            zod.t(this.l, "onPostInitComplete can be called only once per call to getRemoteService");
            this.l.y(i3, strongBinder, bundle, i2);
            this.l = null;
        } else if (i == 2) {
            parcel.readInt();
            psn1.c(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            dmo1 dmo1Var = (dmo1) psn1.a(parcel, dmo1.CREATOR);
            psn1.c(parcel);
            xaa xaaVar = this.l;
            zod.t(xaaVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            zod.s(dmo1Var);
            xaaVar.G(dmo1Var);
            Bundle bundle2 = dmo1Var.a;
            zod.t(this.l, "onPostInitComplete can be called only once per call to getRemoteService");
            this.l.y(i4, strongBinder2, bundle2, i2);
            this.l = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
