package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class es70 {
    public final yj41 a;
    public final gsc1 b;

    public es70(yj41 yj41Var, gsc1 gsc1Var) {
        this.a = yj41Var;
        this.b = gsc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof es70) {
            es70 es70Var = (es70) obj;
            return u890.j(this.a, es70Var.a) && this.b == es70Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
