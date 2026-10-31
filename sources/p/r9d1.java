package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r9d1 implements s9d1 {
    public final ks11 a;
    public final ks11 b;

    public r9d1(ks11 ks11Var, ks11 ks11Var2) {
        this.a = ks11Var;
        this.b = ks11Var2;
    }

    public final ks11 a() {
        return this.a;
    }

    public final ks11 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9d1)) {
            return false;
        }
        r9d1 r9d1Var = (r9d1) obj;
        return this.a.equals(r9d1Var.a) && this.b.equals(r9d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
