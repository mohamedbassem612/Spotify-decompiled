package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xgf {
    public final gto1 a;
    public final y47 b;

    public xgf(gto1 gto1Var, y47 y47Var) {
        this.a = gto1Var;
        this.b = y47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgf)) {
            return false;
        }
        xgf xgfVar = (xgf) obj;
        return this.a.equals(xgfVar.a) && this.b.equals(xgfVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
