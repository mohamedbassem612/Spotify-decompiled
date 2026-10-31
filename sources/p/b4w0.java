package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b4w0 extends f4w0 {
    public final q4w0 a;

    public b4w0(q4w0 q4w0Var) {
        this.a = q4w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4w0) && this.a.equals(((b4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
