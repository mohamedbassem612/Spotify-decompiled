package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w54 implements pdy0 {
    public final boolean a;
    public final v54 b;
    public final feh1 c;
    public final idd1 d;

    public w54(boolean z, v54 v54Var, xz11 xz11Var) {
        this.a = z;
        this.b = v54Var;
        this.c = xz11Var;
        this.d = new idd1(new m44(this, (byte) 24));
    }

    public final boolean a() {
        w54 w54Var = (w54) this.d.getValue();
        return w54Var != null ? w54Var.a() : this.a;
    }

    public final v54 b() {
        v54 v54VarB;
        w54 w54Var = (w54) this.d.getValue();
        return (w54Var == null || (v54VarB = w54Var.b()) == null) ? this.b : v54VarB;
    }

    public final List models() {
        fpb fpbVar = new fpb("exponential_backoff_enabled", "android-authentication-login5", a());
        String str = b().a;
        v54[] v54VarArrValues = v54.values();
        ArrayList arrayList = new ArrayList(v54VarArrValues.length);
        for (v54 v54Var : v54VarArrValues) {
            arrayList.add(v54Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("persist_rotated_stored_credential", "android-authentication-login5", str, arrayList)});
    }

    public w54(xz11 xz11Var) {
        this(false, v54.APP_DEFAULT, xz11Var);
    }
}
