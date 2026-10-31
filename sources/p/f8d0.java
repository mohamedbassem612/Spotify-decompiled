package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f8d0 {
    public final g3d0 a;

    public f8d0(g3d0 g3d0Var) {
        this.a = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8d0) && this.a.equals(((f8d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
