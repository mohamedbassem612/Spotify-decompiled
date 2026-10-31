package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g6f implements r6f {
    public final String a;
    public final t7q0 b;

    public g6f(String str, t7q0 t7q0Var) {
        this.a = str;
        this.b = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6f)) {
            return false;
        }
        g6f g6fVar = (g6f) obj;
        return u890.j(this.a, g6fVar.a) && u890.j(this.b, g6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
