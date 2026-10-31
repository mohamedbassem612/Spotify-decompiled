package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xb8 {
    public final vb8 a;
    public final boolean b;

    public xb8(vb8 vb8Var, boolean z) {
        this.a = vb8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb8)) {
            return false;
        }
        xb8 xb8Var = (xb8) obj;
        return this.a.equals(xb8Var.a) && this.b == xb8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
