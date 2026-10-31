package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fy70 {
    public final jy70 a;
    public final long b;

    public fy70(jy70 jy70Var, long j) {
        this.a = jy70Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy70)) {
            return false;
        }
        fy70 fy70Var = (fy70) obj;
        return u890.j(this.a, fy70Var.a) && this.b == fy70Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
