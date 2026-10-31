package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tu11 {
    public final d0r a;
    public final String b;
    public final d2f1 c;
    public final me30 d;
    public final o3r e = ujo1.t();
    public final o3r f = ujo1.u();
    public final o3r g = w3p1.o(new l4r(pwc0.b, 1, ou11.Z, new j4r(new ak01(this, (byte) 27)), ou11.N0), ou11.t);
    public final o3r h = w3p1.o(new l4r(v061.a, 2, ou11.X, new j4r(ou11.h), ou11.Y), ou11.i);

    public tu11(d0r d0rVar, String str, d2f1 d2f1Var, me30 me30Var) {
        this.a = d0rVar;
        this.b = str;
        this.c = d2f1Var;
        this.d = me30Var;
    }

    public static String d(unb1 unb1Var) {
        jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
        String str = jmb1Var != null ? jmb1Var.a.d : null;
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final boolean a() {
        qxc0 qxc0Var = (qxc0) c(this.g, rih1.a);
        if (qxc0Var == null) {
            return false;
        }
        le30 le30VarA = this.d.a(qxc0Var.e);
        boolean z = qxc0Var.X0;
        d2f1 d2f1Var = this.c;
        jq4 jq4Var = d2f1Var.c;
        if (!d2f1Var.a.b()) {
            return false;
        }
        if (d2f1.a(this.b, le30VarA)) {
            return jq4Var.e();
        }
        return z ? jq4Var.h() : jq4Var.f();
    }

    public final boolean b() {
        return u890.j(c(this.e, rih1.a), Boolean.TRUE);
    }

    public final Object c(o3r o3rVar, Object obj) {
        i1r i1rVarN = x2p1.n(this.a, o3rVar, obj);
        i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
        if (i1rVar != null) {
            return i1rVar.a;
        }
        return null;
    }
}
