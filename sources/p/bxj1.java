package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxj1 {
    public final ywj1 a;
    public final hwq b;

    public bxj1(ywj1 ywj1Var, hwq hwqVar) {
        this.a = ywj1Var;
        this.b = hwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxj1)) {
            return false;
        }
        bxj1 bxj1Var = (bxj1) obj;
        return this.a.equals(bxj1Var.a) && this.b.equals(bxj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
