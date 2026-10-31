package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s7b extends v7b {
    public final i7g0 a;

    public s7b(i7g0 i7g0Var) {
        this.a = i7g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7b) && this.a == ((s7b) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
