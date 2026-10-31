package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rn9 {
    public final jo70 a;
    public final hll b;

    public rn9(jo70 jo70Var, hll hllVar) {
        this.a = jo70Var;
        this.b = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn9)) {
            return false;
        }
        rn9 rn9Var = (rn9) obj;
        return this.a.equals(rn9Var.a) && this.b.equals(rn9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
