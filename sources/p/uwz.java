package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uwz implements k700 {
    public final cgk1 a;

    public uwz(cgk1 cgk1Var) {
        this.a = cgk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwz) && u890.j(this.a, ((uwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
