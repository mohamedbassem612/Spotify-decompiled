package p;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.ModuleUnavailableException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ca61 {
    public static final pue0 b = new pue0("Session", null);
    public final ion1 a;

    public ca61(Context context, String str, String str2) {
        ion1 ion1VarG1;
        try {
            ion1VarG1 = xon1.b(context).g1(str, str2, new cjn1(this));
        } catch (RemoteException | ModuleUnavailableException unused) {
            xon1.a.b("Unable to call %s on %s.", "newSessionImpl", tpn1.class.getSimpleName());
            ion1VarG1 = null;
        }
        this.a = ion1VarG1;
    }

    public final boolean a() {
        zod.n("Must be called from the main thread.");
        con1 con1Var = this.a;
        if (con1Var != null) {
            try {
                return con1Var.i1();
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "isConnected", ion1.class.getSimpleName());
            }
        }
        return false;
    }

    public final void b(int i) {
        con1 con1Var = this.a;
        if (con1Var == null) {
            return;
        }
        try {
            con1Var.m1(i);
        } catch (RemoteException unused) {
            b.b("Unable to call %s on %s.", "notifySessionEnded", ion1.class.getSimpleName());
        }
    }

    public final int c() {
        zod.n("Must be called from the main thread.");
        con1 con1Var = this.a;
        if (con1Var != null) {
            try {
                con1 con1Var2 = con1Var;
                if (con1Var2.g1() >= 211100000) {
                    return con1Var2.k1();
                }
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "getSessionStartType", ion1.class.getSimpleName());
            }
        }
        return 0;
    }

    public final vh70 d() {
        con1 con1Var = this.a;
        if (con1Var != null) {
            try {
                return con1Var.h1();
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "getWrappedObject", ion1.class.getSimpleName());
            }
        }
        return null;
    }
}
