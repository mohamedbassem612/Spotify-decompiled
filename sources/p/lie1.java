package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lie1 {
    public final mhe1 a;
    public final lhe1 b;

    public lie1(mhe1 mhe1Var, lhe1 lhe1Var) {
        this.a = mhe1Var;
        this.b = lhe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lie1)) {
            return false;
        }
        lie1 lie1Var = (lie1) obj;
        return this.a == lie1Var.a && this.b == lie1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
