package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lj8 {
    public final jj8 a;
    public final boolean b;

    public lj8(jj8 jj8Var, boolean z) {
        this.a = jj8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj8)) {
            return false;
        }
        lj8 lj8Var = (lj8) obj;
        return this.a == lj8Var.a && this.b == lj8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
