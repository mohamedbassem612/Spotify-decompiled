package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6f implements r6f {
    public final t7q0 a;

    public i6f(t7q0 t7q0Var) {
        this.a = t7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6f) && u890.j(this.a, ((i6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
