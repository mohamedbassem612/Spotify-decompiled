package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g3f implements q3f {
    public final f7q0 a;
    public final long b;

    public g3f(f7q0 f7q0Var, long j) {
        this.a = f7q0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3f)) {
            return false;
        }
        g3f g3fVar = (g3f) obj;
        return this.a.equals(g3fVar.a) && this.b == g3fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
