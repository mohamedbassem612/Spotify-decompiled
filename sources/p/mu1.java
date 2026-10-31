package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mu1 {
    public final tu1 a;
    public final boolean b;
    public final boolean c;

    public mu1(tu1 tu1Var, boolean z, boolean z2) {
        this.a = tu1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return this.a.equals(mu1Var.a) && this.b == mu1Var.b && this.c == mu1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
