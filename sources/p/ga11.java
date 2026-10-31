package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ga11 {
    public final qxc0 a;
    public final boolean b;

    public ga11(qxc0 qxc0Var, boolean z) {
        this.a = qxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga11)) {
            return false;
        }
        ga11 ga11Var = (ga11) obj;
        return this.a.equals(ga11Var.a) && this.b == ga11Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
