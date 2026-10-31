package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s4k0 {
    public final py21 a;

    public s4k0(py21 py21Var) {
        this.a = py21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4k0) && u890.j(this.a, ((s4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
