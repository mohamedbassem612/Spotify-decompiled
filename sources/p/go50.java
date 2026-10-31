package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class go50 implements ho50 {
    public final v1p0 a;

    public go50(v1p0 v1p0Var) {
        this.a = v1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go50) && u890.j(this.a, ((go50) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
