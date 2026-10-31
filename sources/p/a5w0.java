package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a5w0 implements b5w0 {
    public final ucd0 a;

    public a5w0(ucd0 ucd0Var) {
        this.a = ucd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5w0) && this.a.equals(((a5w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
