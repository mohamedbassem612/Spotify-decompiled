package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lai1 {
    public final boolean a;
    public final spq0 b;

    public lai1(spq0 spq0Var, boolean z) {
        this.a = z;
        this.b = spq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lai1)) {
            return false;
        }
        lai1 lai1Var = (lai1) obj;
        return this.a == lai1Var.a && this.b.equals(lai1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
