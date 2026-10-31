package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zr0 {
    public final ji0 a;
    public final int b;

    public zr0(ji0 ji0Var, int i) {
        this.a = ji0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr0)) {
            return false;
        }
        zr0 zr0Var = (zr0) obj;
        return u890.j(this.a, zr0Var.a) && this.b == zr0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
