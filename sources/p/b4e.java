package p;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b4e extends ca61 {
    public static final pue0 m = new pue0("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final zhn1 e;
    public final p3e f;
    public final fsn1 g;
    public final a8p1 h;
    public arn1 i;
    public e321 j;
    public CastDevice k;
    public utw0 l;

    public b4e(Context context, String str, String str2, p3e p3eVar, fsn1 fsn1Var, a8p1 a8p1Var) {
        super(context, str, str2);
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = p3eVar;
        this.g = fsn1Var;
        this.h = a8p1Var;
        vh70 vh70VarD = d();
        wbp1 wbp1Var = new wbp1(this);
        pue0 pue0Var = xon1.a;
        zhn1 zhn1VarH1 = null;
        if (vh70VarD != null) {
            try {
                zhn1VarH1 = xon1.b(context).h1(p3eVar, vh70VarD, wbp1Var);
            } catch (RemoteException | ModuleUnavailableException unused) {
                xon1.a.b("Unable to call %s on %s.", "newCastSessionImpl", tpn1.class.getSimpleName());
            }
        }
        this.e = zhn1VarH1;
    }

    public final void e(String str, Task task) {
        pue0 pue0Var = m;
        rgn1 rgn1Var = this.e;
        if (rgn1Var == null) {
            return;
        }
        try {
            if (!task.j()) {
                Exception excF = task.f();
                if (!(excF instanceof ApiException)) {
                    rgn1Var.h1(2476);
                    return;
                } else {
                    rgn1Var.h1(((ApiException) excF).getStatusCode());
                    return;
                }
            }
            o5p1 o5p1Var = (o5p1) task.g();
            o5p1Var.getClass();
            if (!o5p1Var.getStatus().j()) {
                pue0Var.a("%s() -> failure result", str);
                rgn1Var.h1(o5p1Var.getStatus().a);
                return;
            }
            pue0Var.a("%s() -> success result", str);
            e321 e321Var = new e321(new knn1());
            this.j = e321Var;
            e321Var.n(this.i);
            this.j.l(new oxo1(this));
            this.j.o();
            a8p1 a8p1Var = this.h;
            e321 e321Var2 = this.j;
            zod.n("Must be called from the main thread.");
            a8p1Var.a(e321Var2, this.k);
            yz5 yz5VarA = o5p1Var.a();
            zod.s(yz5VarA);
            String strB = o5p1Var.b();
            String strC = o5p1Var.c();
            zod.s(strC);
            rgn1Var.g1(yz5VarA, strB, strC, o5p1Var.d());
        } catch (RemoteException unused) {
            pue0Var.b("Unable to call %s on %s.", "methods", zhn1.class.getSimpleName());
        }
    }

    public final void f(Bundle bundle) {
        CastDevice castDeviceF = CastDevice.F(bundle);
        this.k = castDeviceF;
        boolean zJ1 = false;
        if (castDeviceF == null) {
            zod.n("Must be called from the main thread.");
            con1 con1Var = this.a;
            pue0 pue0Var = ca61.b;
            if (con1Var != null) {
                try {
                    zJ1 = con1Var.j1();
                } catch (RemoteException unused) {
                    pue0Var.b("Unable to call %s on %s.", "isResuming", ion1.class.getSimpleName());
                }
            }
            if (zJ1) {
                if (con1Var == null) {
                    return;
                }
                try {
                    con1Var.n1();
                    return;
                } catch (RemoteException unused2) {
                    pue0Var.b("Unable to call %s on %s.", "notifyFailedToResumeSession", ion1.class.getSimpleName());
                    return;
                }
            }
            if (con1Var == null) {
                return;
            }
            try {
                con1Var.l1();
                return;
            } catch (RemoteException unused3) {
                pue0Var.b("Unable to call %s on %s.", "notifyFailedToStartSession", ion1.class.getSimpleName());
                return;
            }
        }
        arn1 arn1Var = this.i;
        if (arn1Var != null) {
            arn1Var.o();
            this.i = null;
        }
        m.a("Acquiring a connection to Google Play Services for %s", this.k);
        CastDevice castDevice = this.k;
        zod.s(castDevice);
        Bundle bundle2 = new Bundle();
        p3e p3eVar = this.f;
        h3e h3eVar = p3eVar == null ? null : p3eVar.f;
        vro0 vro0Var = h3eVar != null ? h3eVar.d : null;
        boolean z = h3eVar != null && h3eVar.e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", vro0Var != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        fsn1 fsn1Var = this.g;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", fsn1Var.b1());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", fsn1Var.r);
        cab cabVar = new cab(castDevice, new zdp1(this));
        cabVar.E(bundle2);
        arn1 arn1VarA = p2e.a(this.c, cabVar.m());
        arn1VarA.m(new uhp1(this));
        this.i = arn1VarA;
        arn1VarA.n();
    }
}
