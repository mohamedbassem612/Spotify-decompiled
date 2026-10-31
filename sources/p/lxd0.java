package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lxd0 implements rxd0 {
    public final String a;
    public final wzd0 b;

    public lxd0(String str, wzd0 wzd0Var) {
        this.a = str;
        this.b = wzd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxd0)) {
            return false;
        }
        lxd0 lxd0Var = (lxd0) obj;
        return this.a.equals(lxd0Var.a) && this.b.equals(lxd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
