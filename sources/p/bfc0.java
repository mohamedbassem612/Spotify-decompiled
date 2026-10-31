package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bfc0 {
    public final zec0 a;
    public final boolean b;

    public bfc0(zec0 zec0Var, boolean z) {
        this.a = zec0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfc0)) {
            return false;
        }
        bfc0 bfc0Var = (bfc0) obj;
        return u890.j(this.a, bfc0Var.a) && this.b == bfc0Var.b;
    }

    public final int hashCode() {
        zec0 zec0Var = this.a;
        return Boolean.hashCode(this.b) + ((zec0Var == null ? 0 : zec0Var.hashCode()) * 31);
    }
}
