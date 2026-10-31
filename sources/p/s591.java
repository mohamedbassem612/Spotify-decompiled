package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s591 {
    public final r591 a;

    public s591(r591 r591Var) {
        this.a = r591Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s591) && this.a == ((s591) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
