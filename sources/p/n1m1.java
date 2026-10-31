package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n1m1 implements r1m1 {
    public final i5u0 a;
    public final ylf1 b;

    public n1m1(i5u0 i5u0Var, ylf1 ylf1Var) {
        this.a = i5u0Var;
        this.b = ylf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1m1)) {
            return false;
        }
        n1m1 n1m1Var = (n1m1) obj;
        return this.a.equals(n1m1Var.a) && this.b.equals(n1m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
