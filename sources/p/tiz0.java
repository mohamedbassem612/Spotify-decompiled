package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tiz0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final jlz0 d;

    static {
        jlz0 jlz0Var = jlz0.i;
    }

    public tiz0(String str, boolean z, boolean z2, jlz0 jlz0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = jlz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiz0)) {
            return false;
        }
        tiz0 tiz0Var = (tiz0) obj;
        return u890.j(this.a, tiz0Var.a) && this.b == tiz0Var.b && this.c == tiz0Var.c && u890.j(this.d, tiz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
