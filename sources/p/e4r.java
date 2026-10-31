package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class e4r {
    public static final o3r a = w3p1.n(new l4r(pwc0.r, 2, d4r.Y, new j4r(d4r.t), d4r.Z), new l4r(new xv00(rc11.a.b(l1z.class)), 2, d4r.N0, new j4r(d4r.X), d4r.O0), ido.S0);
    public static final ppa0 b;
    public static final ppa0 c;

    static {
        ppa0 ppa0Var = lo70.a;
        b = ppa0Var;
        c = ppa0Var.b(ppa0Var);
    }

    public static final o3r a(boolean z) {
        pwc0 pwc0Var = pwc0.r;
        ppa0 ppa0Var = c;
        ppa0 ppa0Var2 = b;
        if (!z) {
            l4r l4rVar = new l4r(pwc0Var, 2, ywq.e1, new j4r(z3r.d), y3r.Q0);
            jd11 jd11Var = rc11.a;
            return w3p1.l(l4rVar, new l4r(new xv00(jd11Var.b(l1z.class)), 2, y3r.T0, new j4r(z3r.g), y3r.W0), new l4r(new xv00(jd11Var.b(hzy.class)), 2, y3r.Y0, new k4r(z3r.i, ppa0Var2), y3r.Z0), new l4r(new xv00(jd11Var.b(w281.class)), 2, y3r.a1, new k4r(z3r.t, ppa0Var), y3r.b1), zho.t);
        }
        l4r l4rVar2 = new l4r(pwc0Var, 2, y3r.c1, new j4r(z3r.X), ywq.d1);
        jd11 jd11Var2 = rc11.a;
        l4r l4rVar3 = new l4r(new xv00(jd11Var2.b(l1z.class)), 2, y3r.b, new j4r(z3r.Y), y3r.d);
        hvm hvmVar = hvm.d;
        return w3p1.i(l4rVar2, l4rVar3, new l4r(hvmVar, 2, y3r.e, new j4r(z3r.Z), y3r.f), new l4r(hvmVar, 2, y3r.g, new j4r(z3r.N0), y3r.h), new l4r(hvmVar, 2, y3r.i, new j4r(y3r.d1), y3r.t), new l4r(new xv00(jd11Var2.b(hzy.class)), 2, y3r.X, new k4r(y3r.e1, ppa0Var2), y3r.Z), new l4r(new xv00(jd11Var2.b(w281.class)), 2, y3r.N0, new k4r(z3r.c, ppa0Var), y3r.P0), a4r.b);
    }

    public static final n6u b(qfd qfdVar, boolean z, boolean z2) {
        int i = qfdVar.c;
        ArrayList arrayList = qfdVar.e;
        if (i == 3 || arrayList.contains(l131.a) || arrayList.contains(l131.c)) {
            return m6u.a;
        }
        return ((!z || z2) && (qfdVar.b || !(arrayList.contains(l131.b) || arrayList.contains(l131.e)))) ? j6u.a : l6u.a;
    }
}
