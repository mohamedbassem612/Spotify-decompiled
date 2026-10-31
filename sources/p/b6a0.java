package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b6a0 {
    public final d6a0 a;
    public final a6a0 b;

    public b6a0(d6a0 d6a0Var, a6a0 a6a0Var) {
        this.a = d6a0Var;
        this.b = a6a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6a0)) {
            return false;
        }
        b6a0 b6a0Var = (b6a0) obj;
        return this.a.equals(b6a0Var.a) && this.b.equals(b6a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
