package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s5b {
    public final m87 a;

    public s5b(m87 m87Var) {
        this.a = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5b) && this.a.equals(((s5b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
