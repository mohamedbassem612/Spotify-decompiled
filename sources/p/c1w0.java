package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c1w0 {
    public final j4w0 a;

    public c1w0(j4w0 j4w0Var) {
        this.a = j4w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1w0) && this.a.equals(((c1w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
