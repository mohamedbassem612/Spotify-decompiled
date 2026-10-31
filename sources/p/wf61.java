package p;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wf61 {
    public static final pue0 c = new pue0("SessionManager", null);
    public final pon1 a;
    public final Context b;

    public wf61(pon1 pon1Var, Context context) {
        this.a = pon1Var;
        this.b = context;
    }

    public final void a(eg61 eg61Var) {
        zod.n("Must be called from the main thread.");
        try {
            pon1 pon1Var = this.a;
            mh70 gqn1Var = new gqn1(eg61Var);
            Parcel parcelA1 = pon1Var.a1();
            osn1.c(parcelA1, gqn1Var);
            pon1Var.c1(2, parcelA1);
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "addSessionManagerListener", pon1.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        pue0 pue0Var = c;
        zod.n("Must be called from the main thread.");
        try {
            pue0Var.c("End session for %s", this.b.getPackageName());
            pon1 pon1Var = this.a;
            Parcel parcelA1 = pon1Var.a1();
            int i = osn1.a;
            parcelA1.writeInt(1);
            parcelA1.writeInt(z ? 1 : 0);
            pon1Var.c1(6, parcelA1);
        } catch (RemoteException unused) {
            pue0Var.b("Unable to call %s on %s.", "endCurrentSession", pon1.class.getSimpleName());
        }
    }

    public final ca61 c() {
        zod.n("Must be called from the main thread.");
        try {
            pon1 pon1Var = this.a;
            Parcel parcelB1 = pon1Var.b1(1, pon1Var.a1());
            vh70 vh70VarB1 = qfp0.b1(parcelB1.readStrongBinder());
            parcelB1.recycle();
            return (ca61) qfp0.c1(vh70VarB1);
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "getWrappedCurrentSession", pon1.class.getSimpleName());
            return null;
        }
    }
}
