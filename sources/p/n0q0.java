package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n0q0 implements p0q0 {
    public final String a;
    public final j82 b;

    public n0q0(String str, j82 j82Var) {
        this.a = str;
        this.b = j82Var;
    }

    public final j82 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0q0)) {
            return false;
        }
        n0q0 n0q0Var = (n0q0) obj;
        return u890.j(this.a, n0q0Var.a) && u890.j(this.b, n0q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ n0q0(String str) {
        this(str, m0q0.d);
    }
}
