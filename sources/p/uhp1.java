package p;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uhp1 {
    public final /* synthetic */ b4e a;

    public uhp1(b4e b4eVar) {
        this.a = b4eVar;
    }

    public final void a() {
        b4e b4eVar = this.a;
        zhn1 zhn1Var = b4eVar.e;
        if (zhn1Var == null) {
            return;
        }
        try {
            e321 e321Var = b4eVar.j;
            if (e321Var != null) {
                e321Var.o();
            }
            rgn1 rgn1Var = (rgn1) zhn1Var;
            Parcel parcelA1 = rgn1Var.a1();
            int i = osn1.a;
            parcelA1.writeInt(0);
            rgn1Var.c1(1, parcelA1);
        } catch (RemoteException unused) {
            b4e.m.b("Unable to call %s on %s.", new Object[]{"onConnected", zhn1.class.getSimpleName()});
        }
        utw0 utw0Var = b4eVar.l;
        if (utw0Var != null) {
            ((e821) utw0Var.a).z(new dwn1(new ftn1(3)));
        }
    }
}
