package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4d0 implements f4d0 {
    public final g3d0 a;

    public e4d0(g3d0 g3d0Var) {
        this.a = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4d0) && u890.j(this.a, ((e4d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
