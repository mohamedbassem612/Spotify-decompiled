package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w5a0 {
    public final String a;
    public final boolean b;
    public final x5a0 c;

    public w5a0(String str, boolean z, x5a0 x5a0Var) {
        this.a = str;
        this.b = z;
        this.c = x5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5a0)) {
            return false;
        }
        w5a0 w5a0Var = (w5a0) obj;
        return u890.j(this.a, w5a0Var.a) && this.b == w5a0Var.b && this.c.equals(w5a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
