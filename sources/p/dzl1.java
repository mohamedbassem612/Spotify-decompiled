package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dzl1 {
    public final bzl1 a;
    public final boolean b;

    public dzl1(bzl1 bzl1Var, boolean z) {
        this.a = bzl1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzl1)) {
            return false;
        }
        dzl1 dzl1Var = (dzl1) obj;
        return u890.j(this.a, dzl1Var.a) && this.b == dzl1Var.b;
    }

    public final int hashCode() {
        bzl1 bzl1Var = this.a;
        return Boolean.hashCode(this.b) + ((bzl1Var == null ? 0 : bzl1Var.hashCode()) * 31);
    }
}
