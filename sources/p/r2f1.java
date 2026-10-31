package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2f1 {
    public final zob1 a;

    public r2f1(wen0 wen0Var) {
        this.a = wen0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2f1) && this.a.equals(((r2f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
