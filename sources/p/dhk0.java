package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dhk0 {
    public final wsc0 a;
    public final boolean b;

    public dhk0(wsc0 wsc0Var, boolean z) {
        this.a = wsc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhk0)) {
            return false;
        }
        dhk0 dhk0Var = (dhk0) obj;
        return u890.j(this.a, dhk0Var.a) && this.b == dhk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
