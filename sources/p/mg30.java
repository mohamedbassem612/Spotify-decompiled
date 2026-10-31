package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mg30 {
    public final ro30 a;
    public final vg30 b;
    public final bkl c;
    public final a2k d;

    public mg30(ro30 ro30Var, vg30 vg30Var, bkl bklVar, a2k a2kVar) {
        this.a = ro30Var;
        this.b = vg30Var;
        this.c = bklVar;
        this.d = a2kVar;
    }

    public final geh a(frn0 frn0Var, Intent intent, e6w0 e6w0Var) {
        Class cls = frn0Var.a;
        ClassLoader classLoader = mg30.class.getClassLoader();
        if (classLoader == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        zf30 zf30VarA = this.d.a(classLoader, cls.getName());
        zf30VarA.T0(frn0Var.b);
        Object objCast = cls.cast(zf30VarA);
        if (objCast == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        ug30 ug30Var = (zf30) objCast;
        this.b.a(ug30Var, intent, e6w0Var instanceof z5w0 ? ((z5w0) e6w0Var).a : e6w0Var);
        return e6w0Var instanceof z5w0 ? new aeh(new fey(this, ug30Var)) : deh.a;
    }
}
