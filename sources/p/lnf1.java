package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnf1 {
    public final knf1 a;
    public final knf1 b;

    public lnf1(knf1 knf1Var, knf1 knf1Var2) {
        this.a = knf1Var;
        this.b = knf1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnf1)) {
            return false;
        }
        lnf1 lnf1Var = (lnf1) obj;
        return this.a.equals(lnf1Var.a) && this.b.equals(lnf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
