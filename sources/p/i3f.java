package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i3f implements q3f {
    public final f7q0 a;

    public i3f(f7q0 f7q0Var) {
        this.a = f7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3f) && u890.j(this.a, ((i3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
