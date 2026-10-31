package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ns90 implements os90 {
    public final m4o0 a;
    public final boolean b;
    public final String c;
    public final xo90 d;

    public ns90(m4o0 m4o0Var, boolean z, String str, xo90 xo90Var) {
        this.a = m4o0Var;
        this.b = z;
        this.c = str;
        this.d = xo90Var;
    }

    public final xo90 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns90)) {
            return false;
        }
        ns90 ns90Var = (ns90) obj;
        return u890.j(this.a, ns90Var.a) && this.b == ns90Var.b && u890.j(this.c, ns90Var.c) && this.d == ns90Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
