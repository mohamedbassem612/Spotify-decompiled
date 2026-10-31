package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dv51 implements fv51 {
    public final w4i1 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final iu30 f;
    public final int g;
    public final za21 h;

    public dv51(w4i1 w4i1Var, boolean z, int i, int i2, String str, iu30 iu30Var, int i3, za21 za21Var) {
        this.a = w4i1Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = iu30Var;
        this.g = i3;
        this.h = za21Var;
    }

    public final iu30 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv51)) {
            return false;
        }
        dv51 dv51Var = (dv51) obj;
        return u890.j(this.a, dv51Var.a) && this.b == dv51Var.b && this.c == dv51Var.c && this.d == dv51Var.d && this.e.equals(dv51Var.e) && u890.j(this.f, dv51Var.f) && this.g == dv51Var.g && this.h.equals(dv51Var.h);
    }

    public final boolean f() {
        return this.b;
    }

    public final int getSource() {
        return this.d;
    }

    public final int hashCode() {
        return this.h.hashCode() + ab80.k(this.g, ktd.g(this.f, cy30.d(ab80.k(this.d, kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31), 31);
    }
}
