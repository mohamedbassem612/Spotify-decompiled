package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g8o0 implements w11 {
    public final Throwable a;
    public final bk8 b;

    public g8o0(Throwable th, bk8 bk8Var) {
        this.a = th;
        this.b = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8o0)) {
            return false;
        }
        g8o0 g8o0Var = (g8o0) obj;
        return u890.j(this.a, g8o0Var.a) && this.b == g8o0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bk8 bk8Var = this.b;
        return iHashCode + (bk8Var == null ? 0 : bk8Var.hashCode());
    }
}
