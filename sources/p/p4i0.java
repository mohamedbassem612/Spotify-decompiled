package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4i0 implements v4i0 {
    public final String a;
    public final g7i0 b;

    public p4i0(String str, g7i0 g7i0Var) {
        this.a = str;
        this.b = g7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4i0)) {
            return false;
        }
        p4i0 p4i0Var = (p4i0) obj;
        return u890.j(this.a, p4i0Var.a) && u890.j(this.b, p4i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
