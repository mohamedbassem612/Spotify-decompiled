package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fge1 implements gge1 {
    public final m1d a;
    public final long b;

    public fge1(m1d m1dVar, long j) {
        this.a = m1dVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fge1)) {
            return false;
        }
        fge1 fge1Var = (fge1) obj;
        return u890.j(this.a, fge1Var.a) && this.b == fge1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
