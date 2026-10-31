package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h59 {
    public final prn1 a;
    public final boolean b;

    public h59(prn1 prn1Var, boolean z) {
        this.a = prn1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h59)) {
            return false;
        }
        h59 h59Var = (h59) obj;
        return this.a.equals(h59Var.a) && this.b == h59Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
