package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s3b0 {
    public final tka0 a;

    public s3b0(tka0 tka0Var) {
        this.a = tka0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s3b0) {
            return u890.j(this.a, ((s3b0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.n().getName();
    }
}
