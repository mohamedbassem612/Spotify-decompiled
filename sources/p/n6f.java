package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n6f implements r6f {
    public final f7q0 a;

    public n6f(f7q0 f7q0Var) {
        this.a = f7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6f) && u890.j(this.a, ((n6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
