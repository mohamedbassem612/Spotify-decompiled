package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6p0 {
    public final p6p0 a;

    public q6p0(p6p0 p6p0Var) {
        this.a = p6p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6p0) && this.a.equals(((q6p0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
