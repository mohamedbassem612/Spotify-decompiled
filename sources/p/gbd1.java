package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gbd1 implements hbd1 {
    public final mr20 a;
    public final xu30 b;

    public gbd1(mr20 mr20Var, xu30 xu30Var) {
        this.a = mr20Var;
        this.b = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbd1)) {
            return false;
        }
        gbd1 gbd1Var = (gbd1) obj;
        return this.a.equals(gbd1Var.a) && this.b.equals(gbd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
