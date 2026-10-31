package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z0f implements q3f {
    public final uu2 a;

    public z0f(uu2 uu2Var) {
        this.a = uu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0f) && u890.j(this.a, ((z0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
