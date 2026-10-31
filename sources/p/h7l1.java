package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h7l1 {
    public final gw70 a;
    public final pe b;

    public h7l1(gw70 gw70Var, pe peVar) {
        this.a = gw70Var;
        this.b = peVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7l1)) {
            return false;
        }
        h7l1 h7l1Var = (h7l1) obj;
        return this.a.equals(h7l1Var.a) && this.b.equals(h7l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
