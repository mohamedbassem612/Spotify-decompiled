package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uiz0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final jlz0 d;

    static {
        jlz0 jlz0Var = jlz0.i;
    }

    public uiz0(String str, boolean z, boolean z2, jlz0 jlz0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = jlz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiz0)) {
            return false;
        }
        uiz0 uiz0Var = (uiz0) obj;
        return this.a.equals(uiz0Var.a) && this.b == uiz0Var.b && this.c == uiz0Var.c && u890.j(this.d, uiz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
