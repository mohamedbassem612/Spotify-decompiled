package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nq31 implements qq31 {
    public final String a;
    public final long b;

    public nq31(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq31)) {
            return false;
        }
        nq31 nq31Var = (nq31) obj;
        return u890.j(this.a, nq31Var.a) && this.b == nq31Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
