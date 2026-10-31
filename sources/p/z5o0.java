package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5o0 {
    public final h0r0 a;
    public final c7r0 b;

    public z5o0(h0r0 h0r0Var, c7r0 c7r0Var) {
        this.a = h0r0Var;
        this.b = c7r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5o0)) {
            return false;
        }
        z5o0 z5o0Var = (z5o0) obj;
        return u890.j(this.a, z5o0Var.a) && u890.j(this.b, z5o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
