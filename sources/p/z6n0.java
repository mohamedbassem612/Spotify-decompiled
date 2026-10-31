package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z6n0 extends c7n0 {
    public final ela1 a;
    public final u771 b;
    public final int c;
    public final String d;
    public final Throwable e;

    public z6n0(ela1 ela1Var, u771 u771Var, int i, String str, Throwable th) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
        this.d = str;
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6n0)) {
            return false;
        }
        z6n0 z6n0Var = (z6n0) obj;
        return u890.j(this.a, z6n0Var.a) && u890.j(this.b, z6n0Var.b) && this.c == z6n0Var.c && this.d.equals(z6n0Var.d) && this.e.equals(z6n0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(ab80.k(this.c, cfm0.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
