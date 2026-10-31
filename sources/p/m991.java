package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m991 {
    public final boolean a;
    public final long b;

    public m991(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m991)) {
            return false;
        }
        m991 m991Var = (m991) obj;
        return this.a == m991Var.a && jfv.f(this.b, m991Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + iHashCode;
    }
}
