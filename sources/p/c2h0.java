package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c2h0 implements e4h0 {
    public final Throwable a;
    public final long b;

    public c2h0(long j, Throwable th) {
        this.a = th;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2h0)) {
            return false;
        }
        c2h0 c2h0Var = (c2h0) obj;
        return this.a.equals(c2h0Var.a) && this.b == c2h0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
