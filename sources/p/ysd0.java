package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ysd0 extends rtd0 {
    public final psd0 a;
    public final boolean b;

    public ysd0(psd0 psd0Var, boolean z) {
        this.a = psd0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysd0)) {
            return false;
        }
        ysd0 ysd0Var = (ysd0) obj;
        return this.a.equals(ysd0Var.a) && this.b == ysd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
