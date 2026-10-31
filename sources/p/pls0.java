package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pls0 implements qls0 {
    public final boolean a;
    public final int b;

    public pls0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pls0)) {
            return false;
        }
        pls0 pls0Var = (pls0) obj;
        return this.a == pls0Var.a && this.b == pls0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
