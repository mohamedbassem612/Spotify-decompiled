package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class om81 {
    public final n4d1 a;
    public final boolean b;

    public om81(n4d1 n4d1Var, boolean z) {
        this.a = n4d1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om81)) {
            return false;
        }
        om81 om81Var = (om81) obj;
        return this.a.equals(om81Var.a) && this.b == om81Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
