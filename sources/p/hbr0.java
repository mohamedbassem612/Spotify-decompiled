package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbr0 {
    public final gbr0 a;
    public final ibr0 b;

    public hbr0(gbr0 gbr0Var, ibr0 ibr0Var) {
        this.a = gbr0Var;
        this.b = ibr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbr0)) {
            return false;
        }
        hbr0 hbr0Var = (hbr0) obj;
        return this.a.equals(hbr0Var.a) && this.b.equals(hbr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
