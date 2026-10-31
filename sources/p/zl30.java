package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zl30 {
    public final ozh1 a;
    public final boolean b;

    public zl30(ozh1 ozh1Var, boolean z) {
        this.a = ozh1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl30)) {
            return false;
        }
        zl30 zl30Var = (zl30) obj;
        return u890.j(this.a, zl30Var.a) && this.b == zl30Var.b;
    }

    public final int hashCode() {
        ozh1 ozh1Var = this.a;
        return Boolean.hashCode(this.b) + ((ozh1Var == null ? 0 : ozh1Var.hashCode()) * 31);
    }
}
