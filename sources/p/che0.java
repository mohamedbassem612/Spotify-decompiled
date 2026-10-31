package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class che0 {
    public final nma1 a;
    public final xd50 b;

    public che0(nma1 nma1Var, xd50 xd50Var) {
        this.a = nma1Var;
        this.b = xd50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof che0)) {
            return false;
        }
        che0 che0Var = (che0) obj;
        return this.a.equals(che0Var.a) && this.b.equals(che0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }
}
