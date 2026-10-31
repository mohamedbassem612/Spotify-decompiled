package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ua0 implements wa0 {
    public final iyl1 a;
    public final int b;

    public ua0(iyl1 iyl1Var, int i) {
        this.a = iyl1Var;
        this.b = i;
    }

    @Override // p.wa0
    public final iyl1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return u890.j(this.a, ua0Var.a) && this.b == ua0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
