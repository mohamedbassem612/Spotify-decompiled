package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ev51 implements fv51 {
    public final w4i1 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final iu30 f;

    public ev51(w4i1 w4i1Var, boolean z, int i, int i2, String str, iu30 iu30Var) {
        this.a = w4i1Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = iu30Var;
    }

    public final iu30 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev51)) {
            return false;
        }
        ev51 ev51Var = (ev51) obj;
        return u890.j(this.a, ev51Var.a) && this.b == ev51Var.b && this.c == ev51Var.c && this.d == ev51Var.d && this.e.equals(ev51Var.e) && u890.j(this.f, ev51Var.f);
    }

    public final boolean f() {
        return this.b;
    }

    public final int getSource() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(ab80.k(this.d, kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }
}
