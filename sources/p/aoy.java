package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aoy implements coy {
    public final koy a;
    public final ylt0 b;

    public aoy(koy koyVar, ylt0 ylt0Var) {
        this.a = koyVar;
        this.b = ylt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoy)) {
            return false;
        }
        aoy aoyVar = (aoy) obj;
        return this.a.equals(aoyVar.a) && u890.j(this.b, aoyVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ylt0 ylt0Var = this.b;
        return iHashCode + (ylt0Var == null ? 0 : ylt0Var.hashCode());
    }
}
