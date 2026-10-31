package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0u {
    public final dos0 a;
    public final long b;

    public w0u(dos0 dos0Var, long j) {
        this.a = dos0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0u)) {
            return false;
        }
        w0u w0uVar = (w0u) obj;
        return u890.j(this.a, w0uVar.a) && this.b == w0uVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
