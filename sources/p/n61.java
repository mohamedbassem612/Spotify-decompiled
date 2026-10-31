package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n61 {
    public final su21 a;
    public final boolean b;

    public n61(su21 su21Var, boolean z) {
        this.a = su21Var;
        this.b = z;
    }

    public final su21 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n61)) {
            return false;
        }
        n61 n61Var = (n61) obj;
        return u890.j(this.a, n61Var.a) && this.b == n61Var.b;
    }

    public final int hashCode() {
        su21 su21Var = this.a;
        return Boolean.hashCode(this.b) + ((su21Var == null ? 0 : su21Var.hashCode()) * 31);
    }

    public /* synthetic */ n61() {
        this(null, false);
    }
}
