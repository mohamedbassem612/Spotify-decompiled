package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wwr0 {
    public final xwr0 a;
    public final boolean b;

    public wwr0(xwr0 xwr0Var, boolean z) {
        this.a = xwr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwr0)) {
            return false;
        }
        wwr0 wwr0Var = (wwr0) obj;
        return this.a == wwr0Var.a && this.b == wwr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
