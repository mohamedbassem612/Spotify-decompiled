package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zaa1 {
    public final xaa1 a;
    public final k1r b;

    public zaa1(xaa1 xaa1Var, k1r k1rVar) {
        this.a = xaa1Var;
        this.b = k1rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa1)) {
            return false;
        }
        zaa1 zaa1Var = (zaa1) obj;
        return this.a.equals(zaa1Var.a) && this.b.equals(zaa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
