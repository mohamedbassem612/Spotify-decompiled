package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bft0 {
    public final gwt0 a;
    public final int b;

    public bft0(gwt0 gwt0Var, int i) {
        this.a = gwt0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bft0)) {
            return false;
        }
        bft0 bft0Var = (bft0) obj;
        return this.a.equals(bft0Var.a) && this.b == bft0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
