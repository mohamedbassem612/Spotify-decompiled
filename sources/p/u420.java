package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u420 {
    public final uyx0 a;
    public final long b;

    public u420(uyx0 uyx0Var, long j) {
        this.a = uyx0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u420)) {
            return false;
        }
        u420 u420Var = (u420) obj;
        return this.a.equals(u420Var.a) && this.b == u420Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
