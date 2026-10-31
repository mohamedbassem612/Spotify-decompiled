package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p3z0 {
    public final String a;
    public final String b;
    public final String c;
    public final a3z0 d;
    public final boolean e;
    public final Function0 f;
    public final Function0 g;
    public final oho1 h;

    public p3z0(String str, String str2, String str3, a3z0 a3z0Var, boolean z, Function0 function0, Function0 function1, oho1 oho1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a3z0Var;
        this.e = z;
        this.f = function0;
        this.g = function1;
        this.h = oho1Var;
    }

    public static p3z0 a(p3z0 p3z0Var, oho1 oho1Var) {
        return new p3z0(p3z0Var.a, p3z0Var.b, p3z0Var.c, p3z0Var.d, p3z0Var.e, p3z0Var.f, p3z0Var.g, oho1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3z0)) {
            return false;
        }
        p3z0 p3z0Var = (p3z0) obj;
        return u890.j(this.a, p3z0Var.a) && u890.j(this.b, p3z0Var.b) && u890.j(this.c, p3z0Var.c) && this.d.equals(p3z0Var.d) && this.e == p3z0Var.e && u890.j(this.f, p3z0Var.f) && u890.j(this.g, p3z0Var.g) && u890.j(this.h, p3z0Var.h);
    }

    public final int hashCode() {
        int iN = rjx.n(rjx.n(xcg1.g((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        oho1 oho1Var = this.h;
        return iN + (oho1Var == null ? 0 : oho1Var.hashCode());
    }
}
