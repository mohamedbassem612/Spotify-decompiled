package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class usk implements chu {
    public final fq0 a;

    public usk(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usk) && this.a.equals(((usk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
