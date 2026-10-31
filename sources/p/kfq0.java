package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kfq0 {
    public final gfq0 a;
    public final boolean b;

    public kfq0(gfq0 gfq0Var, boolean z) {
        this.a = gfq0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfq0)) {
            return false;
        }
        kfq0 kfq0Var = (kfq0) obj;
        return u890.j(this.a, kfq0Var.a) && this.b == kfq0Var.b;
    }

    public final int hashCode() {
        gfq0 gfq0Var = this.a;
        return Boolean.hashCode(this.b) + ((gfq0Var == null ? 0 : gfq0Var.hashCode()) * 31);
    }
}
