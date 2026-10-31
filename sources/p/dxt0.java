package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dxt0 {
    public final cxt0 a;
    public final Object b;

    public dxt0(cxt0 cxt0Var, Object obj) {
        this.a = cxt0Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxt0)) {
            return false;
        }
        dxt0 dxt0Var = (dxt0) obj;
        return this.a == dxt0Var.a && this.b.equals(dxt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
