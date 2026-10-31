package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a6x0 extends q6x0 {
    public final m3x0 a;

    public a6x0(m3x0 m3x0Var) {
        this.a = m3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6x0) && this.a.equals(((a6x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
